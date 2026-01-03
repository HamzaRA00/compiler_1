package pythonast.visitor;

import antlr.FinalPythonParser;
import antlr.FinalPythonParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import pythonast.AstNode;
import pythonast.Expression;
import pythonast.Statement;
import pythonast.stmt.*;
import pythonast.atoms.NameAtom;

public class PythonAntlrToStatement extends FinalPythonParserBaseVisitor<Statement> {
    private final PythonAntlrToExpression exprVisitor = new PythonAntlrToExpression();

    private int line(Token t) {
        return t == null ? -1 : t.getLine();
    }

    private List<Statement> suiteStatements(FinalPythonParser.SuiteContext suite) {
        List<Statement> stmts = new ArrayList<>();
        if (suite == null) return stmts;
        for (FinalPythonParser.StatementContext sc : suite.getRuleContexts(FinalPythonParser.StatementContext.class)) {
            Statement s = visit(sc);
            if (s != null) stmts.add(s);
        }
        for (FinalPythonParser.Simple_stmtContext ssc : suite.getRuleContexts(FinalPythonParser.Simple_stmtContext.class)) {
            Statement s = visit(ssc);
            if (s != null) stmts.add(s);
        }
        return stmts;
    }

    @Override
    public Statement visitPass_stmt(FinalPythonParser.Pass_stmtContext ctx) {
        return new PassStmt(line(ctx.start));
    }

    @Override
    public Statement visitBreak_stmt(FinalPythonParser.Break_stmtContext ctx) {
        return new BreakStmt(line(ctx.start));
    }

    @Override
    public Statement visitContinue_stmt(FinalPythonParser.Continue_stmtContext ctx) {
        return new ContinueStmt(line(ctx.start));
    }

    @Override
    public Statement visitSimpleStatement(FinalPythonParser.SimpleStatementContext ctx) {
        Statement res = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Statement s = visit(ctx.getChild(i));
            if (s != null) {
                res = s;
            }
        }
        return res;
    }

    @Override
    public Statement visitSimple_stmt(FinalPythonParser.Simple_stmtContext ctx) {
        Statement res = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.Expr_stmtContext) {
                Statement s = visit(ctx.getChild(i));
                if (s != null) res = s;
            }
            if (ctx.getChild(i) instanceof FinalPythonParser.ImportStmtContext
                || ctx.getChild(i) instanceof FinalPythonParser.PassStmtContext
                || ctx.getChild(i) instanceof FinalPythonParser.FlowStmtContext
                || ctx.getChild(i) instanceof FinalPythonParser.AssertStmtContext
                || ctx.getChild(i) instanceof FinalPythonParser.GlobalStmtContext
                || ctx.getChild(i) instanceof FinalPythonParser.NonlocalStmtContext
                || ctx.getChild(i) instanceof FinalPythonParser.DelStmtContext
                || ctx.getChild(i) instanceof FinalPythonParser.ExpressionStmtContext) {
                Statement s = visit(ctx.getChild(i));
                if (s != null) res = s;
            }
        }
        return res;
    }

    @Override
    public Statement visitCompoundStatement(FinalPythonParser.CompoundStatementContext ctx) {
        Statement res = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Statement s = visit(ctx.getChild(i));
            if (s != null) {
                res = s;
            }
        }
        return res;
    }

    @Override
    public Statement visitReturn_stmt(FinalPythonParser.Return_stmtContext ctx) {
        Expression value = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                value = exprVisitor.visit(ctx.getChild(i));
                break;
            }
        }
        return new ReturnStmt(line(ctx.start), value);
    }

    @Override
    public Statement visitExpressionStmt(FinalPythonParser.ExpressionStmtContext ctx) {
        List<FinalPythonParser.ExprContext> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                exprs.add((FinalPythonParser.ExprContext) ctx.getChild(i));
            } else if (ctx.getChild(i) instanceof FinalPythonParser.AssignStmtContext
                    || ctx.getChild(i) instanceof FinalPythonParser.ExprOnlyStmtContext) {
                return visit(ctx.getChild(i));
            }
        }
        if (exprs.size() >= 2) {
            Expression target = exprVisitor.visit(exprs.get(0));
            Expression value = exprVisitor.visit(exprs.get(exprs.size() - 1));
            return new AssignStmt(line(ctx.start), target, value);
        }
        Expression e = exprs.isEmpty() ? null : exprVisitor.visit(exprs.get(0));
        return new ExprStmt(line(ctx.start), e);
    }

    @Override
    public Statement visitExprOnlyStmt(FinalPythonParser.ExprOnlyStmtContext ctx) {
        List<FinalPythonParser.ExprContext> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                exprs.add((FinalPythonParser.ExprContext) ctx.getChild(i));
            }
        }
        if (exprs.size() >= 2) {
            Expression target = exprVisitor.visit(exprs.get(0));
            Expression value = exprVisitor.visit(exprs.get(exprs.size() - 1));
            return new AssignStmt(line(ctx.start), target, value);
        }
        Expression e = exprs.isEmpty() ? null : exprVisitor.visit(exprs.get(0));
        return new ExprStmt(line(ctx.start), e);
    }

    @Override
    public Statement visitFunctionDef(FinalPythonParser.FunctionDefContext ctx) {
        String name = "";
        List<TerminalNode> names = ctx.getTokens(FinalPythonParser.NAME);
        if (names != null && !names.isEmpty()) {
            name = names.get(0).getText();
        }
        FunctionDef def = new FunctionDef(line(ctx.start), name);
        FinalPythonParser.SuiteContext suite = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.SuiteContext) {
                suite = (FinalPythonParser.SuiteContext) ctx.getChild(i);
                break;
            }
        }
        for (Statement s : suiteStatements(suite)) {
            def.addToBody(s);
        }
        return def;
    }

    @Override
    public Statement visitFunc_def(FinalPythonParser.Func_defContext ctx) {
        String name = "";
        List<TerminalNode> names = ctx.getTokens(FinalPythonParser.NAME);
        if (names != null && !names.isEmpty()) {
            name = names.get(0).getText();
        }
        FunctionDef def = new FunctionDef(line(ctx.start), name);
        FinalPythonParser.SuiteContext suite = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.SuiteContext) {
                suite = (FinalPythonParser.SuiteContext) ctx.getChild(i);
                break;
            }
        }
        for (Statement s : suiteStatements(suite)) {
            def.addToBody(s);
        }
        return def;
    }

    @Override
    public Statement visitClassDef(FinalPythonParser.ClassDefContext ctx) {
        String name = "";
        List<TerminalNode> names = ctx.getTokens(FinalPythonParser.NAME);
        if (names != null && !names.isEmpty()) {
            name = names.get(0).getText();
        }
        ClassDef def = new ClassDef(line(ctx.start), name);
        FinalPythonParser.SuiteContext suite = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.SuiteContext) {
                suite = (FinalPythonParser.SuiteContext) ctx.getChild(i);
                break;
            }
        }
        for (Statement s : suiteStatements(suite)) {
            def.addToBody(s);
        }
        return def;
    }

    @Override
    public Statement visitIfStmt(FinalPythonParser.IfStmtContext ctx) {
        return visit(ctx.if_stmt());
    }

    @Override
    public Statement visitIf_stmt(FinalPythonParser.If_stmtContext ctx) {
        Expression cond = exprVisitor.visit(ctx.expr(0));
        IfStmt ifs = new IfStmt(line(ctx.start), cond);
        List<FinalPythonParser.SuiteContext> suites = ctx.suite();
        if (!suites.isEmpty()) {
            for (Statement s : suiteStatements(suites.get(0))) ifs.addThen(s);
        }
        for (int i = 1; i < suites.size(); i++) {
            for (Statement s : suiteStatements(suites.get(i))) ifs.addElse(s);
        }
        return ifs;
    }

    @Override
    public Statement visitDecoratedFunction(FinalPythonParser.DecoratedFunctionContext ctx) {
        Statement s = visit(ctx.func_def());
        if (s instanceof FunctionDef) {
            FunctionDef def = (FunctionDef) s;
            FinalPythonParser.DecoratorsContext d = ctx.decorators();
            int ln = (d != null && d.start != null) ? d.start.getLine() : def.line;
            DecoratedDef decorated = new DecoratedDef(ln);
            if (d != null) {
                int n = d.getChildCount();
                for (FinalPythonParser.Dotted_nameContext dn : d.dotted_name()) {
                    Expression base = new NameAtom(ln, dn.getText());
                    pythonast.expr.PostfixExpr call = new pythonast.expr.PostfixExpr(ln, base);
                    for (int i = 0; i < n; i++) {
                        if (d.getChild(i) instanceof FinalPythonParser.ArgumentContext) {
                            Expression arg = exprVisitor.visit(d.getChild(i));
                            call.addArg(arg);
                        }
                    }
                    decorated.add(new Decorator(ln, call));
                }
            }
            decorated.add(def);
            return decorated;
        }
        return s;
    }

    @Override
    public Statement visitDecoratedClass(FinalPythonParser.DecoratedClassContext ctx) {
        Statement s = visit(ctx.class_def());
        if (s instanceof ClassDef) {
            ClassDef def = (ClassDef) s;
            FinalPythonParser.DecoratorsContext d = ctx.decorators();
            int ln = (d != null && d.start != null) ? d.start.getLine() : def.line;
            DecoratedDef decorated = new DecoratedDef(ln);
            if (d != null) {
                int n = d.getChildCount();
                for (FinalPythonParser.Dotted_nameContext dn : d.dotted_name()) {
                    Expression base = new NameAtom(ln, dn.getText());
                    pythonast.expr.PostfixExpr call = new pythonast.expr.PostfixExpr(ln, base);
                    for (int i = 0; i < n; i++) {
                        if (d.getChild(i) instanceof FinalPythonParser.ArgumentContext) {
                            Expression arg = exprVisitor.visit(d.getChild(i));
                            call.addArg(arg);
                        }
                    }
                    decorated.add(new Decorator(ln, call));
                }
            }
            decorated.add(def);
            return decorated;
        }
        return s;
    }

    @Override
    public Statement visitImportStmt(FinalPythonParser.ImportStmtContext ctx) {
        // map deeper alts
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ImportStmtFullContext) {
                return new ImportStmt(line(ctx.start));
            }
            if (ctx.getChild(i) instanceof FinalPythonParser.FromImportStmtContext) {
                return new FromImportStmt(line(ctx.start));
            }
        }
        return new ImportStmt(line(ctx.start));
    }

    @Override
    public Statement visitAssignStmt(FinalPythonParser.AssignStmtContext ctx) {
        List<FinalPythonParser.ExprContext> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                exprs.add((FinalPythonParser.ExprContext) ctx.getChild(i));
            }
        }
        if (exprs.size() < 2) {
            Expression e = exprs.isEmpty() ? null : exprVisitor.visit(exprs.get(0));
            return new ExprStmt(line(ctx.start), e);
        }
        Expression target = exprVisitor.visit(exprs.get(0));
        Expression value = exprVisitor.visit(exprs.get(exprs.size() - 1));
        return new AssignStmt(line(ctx.start), target, value);
    }

    @Override
    public Statement visitAnnotatedAssign(FinalPythonParser.AnnotatedAssignContext ctx) {
        Expression target = null;
        Expression value = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                if (target == null) target = exprVisitor.visit(ctx.getChild(i));
                else value = exprVisitor.visit(ctx.getChild(i));
            }
        }
        return new AssignStmt(line(ctx.start), target, value);
    }

    @Override
    public Statement visitGlobal_stmt(FinalPythonParser.Global_stmtContext ctx) {
        return new GlobalStmt(line(ctx.start), ctx.getText());
    }

    @Override
    public Statement visitNonlocal_stmt(FinalPythonParser.Nonlocal_stmtContext ctx) {
        return new NonlocalStmt(line(ctx.start), ctx.getText());
    }

    @Override
    public Statement visitRaise_stmt(FinalPythonParser.Raise_stmtContext ctx) {
        Expression value = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                value = exprVisitor.visit(ctx.getChild(i));
                break;
            }
        }
        return new RaiseStmt(line(ctx.start), value);
    }

    @Override
    public Statement visitTryStmt(FinalPythonParser.TryStmtContext ctx) {
        TryStmt t = new TryStmt(line(ctx.start));
        List<FinalPythonParser.SuiteContext> suites = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.SuiteContext) {
                suites.add((FinalPythonParser.SuiteContext) ctx.getChild(i));
            }
        }
        if (!suites.isEmpty()) {
            for (Statement s : suiteStatements(suites.get(0))) t.addTry(s);
        }
        for (int i = 1; i < suites.size(); i++) {
            for (Statement s : suiteStatements(suites.get(i))) t.addExcept(s);
        }
        return t;
    }
}
