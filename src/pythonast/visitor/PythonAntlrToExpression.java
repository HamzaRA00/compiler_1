package pythonast.visitor;

import antlr.FinalPythonParser;
import antlr.FinalPythonParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import pythonast.Expression;
import pythonast.atoms.*;
import pythonast.expr.*;

public class PythonAntlrToExpression extends FinalPythonParserBaseVisitor<Expression> {
    private int line(Token t) {
        return t == null ? -1 : t.getLine();
    }

    @Override
    public Expression visitAddSubExpr(FinalPythonParser.AddSubExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new AddSubExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitMulDivExpr(FinalPythonParser.MulDivExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new MulDivExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitShiftExpr(FinalPythonParser.ShiftExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new ShiftExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitBitAndExpr(FinalPythonParser.BitAndExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new BitAndExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitBitXorExpr(FinalPythonParser.BitXorExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new BitXorExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitBitOrExpr(FinalPythonParser.BitOrExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new BitOrExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitCompareExpr(FinalPythonParser.CompareExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new CompareExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitIsNotExpr(FinalPythonParser.IsNotExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(3));
        return new IsNotExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitNotInExpr(FinalPythonParser.NotInExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(3));
        return new NotInExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitUnaryExpr(FinalPythonParser.UnaryExprContext ctx) {
        Expression inner = visit(ctx.getChild(1));
        return new UnaryExpr(line(ctx.start), inner);
    }

    @Override
    public Expression visitNotExpr(FinalPythonParser.NotExprContext ctx) {
        Expression inner = visit(ctx.getChild(1));
        return new UnaryExpr(line(ctx.start), inner);
    }

    @Override
    public Expression visitPowerExpr(FinalPythonParser.PowerExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new PowerExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitLogicalAndExpr(FinalPythonParser.LogicalAndExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new LogicalAndExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitLogicalOrExpr(FinalPythonParser.LogicalOrExprContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new LogicalOrExpr(line(ctx.start), left, right);
    }

    @Override
    public Expression visitConditionalExpr(FinalPythonParser.ConditionalExprContext ctx) {
        Expression expr = visit(ctx.getChild(0));
        Expression cond = visit(ctx.getChild(2));
        Expression elseExpr = visit(ctx.getChild(4));
        return new ConditionalExpr(line(ctx.start), expr, cond, elseExpr);
    }

    @Override
    public Expression visitAtomExpr(FinalPythonParser.AtomExprContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Expression visitPostfixExpr(FinalPythonParser.PostfixExprContext ctx) {
        Expression base = visit(ctx.getChild(0));
        PostfixExpr p = new PostfixExpr(line(ctx.start), base);
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ArgumentContext) {
                Expression arg = visit(ctx.getChild(i));
                p.addArg(arg);
            }
        }
        return p;
    }

    @Override
    public Expression visitNameAtom(FinalPythonParser.NameAtomContext ctx) {
        Token t = ctx.getStart();
        return new NameAtom(line(t), ctx.getText());
    }

    @Override
    public Expression visitNumberAtom(FinalPythonParser.NumberAtomContext ctx) {
        Token t = ctx.getStart();
        return new NumberAtom(line(t), ctx.getText());
    }

    @Override
    public Expression visitStringAtom(FinalPythonParser.StringAtomContext ctx) {
        Token t = ctx.getStart();
        return new StringAtom(line(t), ctx.getText());
    }

    @Override
    public Expression visitNoneAtom(FinalPythonParser.NoneAtomContext ctx) {
        return new NoneAtom(line(ctx.start));
    }

    @Override
    public Expression visitTrueAtom(FinalPythonParser.TrueAtomContext ctx) {
        return new TrueAtom(line(ctx.start));
    }

    @Override
    public Expression visitFalseAtom(FinalPythonParser.FalseAtomContext ctx) {
        return new FalseAtom(line(ctx.start));
    }

    @Override
    public Expression visitTupleOrParen(FinalPythonParser.TupleOrParenContext ctx) {
        TupleOrParen tuple = new TupleOrParen(line(ctx.start));
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                tuple.add(visit(ctx.getChild(i)));
            }
        }
        return tuple;
    }

    @Override
    public Expression visitListLiteral(FinalPythonParser.ListLiteralContext ctx) {
        ListLiteral list = new ListLiteral(line(ctx.start));
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                list.add(visit(ctx.getChild(i)));
            }
        }
        return list;
    }

    @Override
    public Expression visitDictComp(FinalPythonParser.DictCompContext ctx) {
        DictLiteral dict = new DictLiteral(line(ctx.start));
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.EntryContext) {
                Expression e = visit(ctx.getChild(i));
                if (e instanceof DictEntry) {
                    dict.add((DictEntry) e);
                }
            }
        }
        return dict;
    }

    @Override
    public Expression visitEntry(FinalPythonParser.EntryContext ctx) {
        Expression key = null;
        Expression value = null;
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            if (key == null && ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                key = visit(ctx.getChild(i));
            } else if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                value = visit(ctx.getChild(i));
            }
        }
        return new DictEntry(line(ctx.start), key, value);
    }

    @Override
    public Expression visitDict_comp(FinalPythonParser.Dict_compContext ctx) {
        DictLiteral dict = new DictLiteral(line(ctx.start));
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.EntryContext) {
                Expression e = visit(ctx.getChild(i));
                if (e instanceof DictEntry) {
                    dict.add((DictEntry) e);
                }
            }
        }
        return dict;
    }

    @Override
    public Expression visitList_comp(FinalPythonParser.List_compContext ctx) {
        ListComp comp = new ListComp(line(ctx.start));
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                comp.add(visit(ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof FinalPythonParser.Comp_forContext) {
                comp.add(visit(ctx.getChild(i)));
            }
        }
        return comp;
    }

    @Override
    public Expression visitComp_for(FinalPythonParser.Comp_forContext ctx) {
        TupleOrParen t = new TupleOrParen(line(ctx.start));
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            if (ctx.getChild(i) instanceof FinalPythonParser.ExprContext) {
                t.add(visit(ctx.getChild(i)));
            }
        }
        return t;
    }

    @Override
    public Expression visitPositionalArg(FinalPythonParser.PositionalArgContext ctx) {
        return visit(ctx.expr());
    }
}
