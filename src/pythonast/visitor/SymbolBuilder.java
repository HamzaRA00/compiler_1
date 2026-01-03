package pythonast.visitor;

import pythonast.ProgramAst;
import pythonast.Statement;
import pythonast.Expression;
import pythonast.atoms.NameAtom;
import pythonast.stmt.*;
import pythonast.symbols.Symbol;
import pythonast.symbols.SymbolKind;
import pythonast.symbols.SymbolTable;

import java.util.List;

public class SymbolBuilder {
    private final SymbolTable table = new SymbolTable();

    public SymbolBuilder(ProgramAst program) {
        for (Statement s : program.statements) {
            visitStmt(s);
        }
    }

    public SymbolTable getTable() {
        return table;
    }

    private void visitStmt(Statement s) {
        if (s instanceof AssignStmt) {
            visitAssign((AssignStmt) s);
        } else if (s instanceof ExprStmt) {
            // ignore usage-only expressions
        } else if (s instanceof FunctionDef) {
            visitFunc((FunctionDef) s);
        } else if (s instanceof ClassDef) {
            visitClass((ClassDef) s);
        } else if (s instanceof DecoratedDef) {
            visitDecorated((DecoratedDef) s);
        } else if (s instanceof IfStmt) {
            visitIf((IfStmt) s);
        } else if (s instanceof TryStmt) {
            visitTry((TryStmt) s);
        } else if (s instanceof ReturnStmt) {
        } else if (s instanceof ImportStmt) {
            table.add(new Symbol("__import__", SymbolKind.IMPORT, s.line));
        } else if (s instanceof FromImportStmt) {
            table.add(new Symbol("__from_import__", SymbolKind.IMPORT, s.line));
        }
    }

    private void visitAssign(AssignStmt a) {
        if (a.target instanceof NameAtom) {
            String name = ((NameAtom) a.target).name;
            table.add(new Symbol(name, SymbolKind.VARIABLE, a.line));
        }
    }

    private void visitFunc(FunctionDef f) {
        table.add(new Symbol(f.name, SymbolKind.FUNCTION, f.line));
        for (pythonast.AstNode n : f.body) {
            if (n instanceof Statement) visitStmt((Statement) n);
        }
    }

    private void visitClass(ClassDef c) {
        table.add(new Symbol(c.name, SymbolKind.CLASS, c.line));
        for (pythonast.AstNode n : c.body) {
            if (n instanceof Statement) visitStmt((Statement) n);
        }
    }

    private void visitDecorated(DecoratedDef d) {
        for (pythonast.AstNode n : d.children()) {
            if (n instanceof Statement) visitStmt((Statement) n);
        }
    }

    private void visitIf(IfStmt i) {
        for (Statement s : i.thenBody) visitStmt(s);
        for (Statement s : i.elseBody) visitStmt(s);
    }

    private void visitTry(TryStmt t) {
        for (Statement s : t.tryBody) visitStmt(s);
        for (Statement s : t.exceptBodies) visitStmt(s);
        for (Statement s : t.finallyBody) visitStmt(s);
    }
}
