package pythonast.stmt;

import pythonast.AstNode;
import pythonast.Statement;

import java.util.ArrayList;
import java.util.List;

public class TryStmt extends Statement {
    public final List<Statement> tryBody = new ArrayList<>();
    public final List<Statement> exceptBodies = new ArrayList<>();
    public final List<Statement> finallyBody = new ArrayList<>();

    public TryStmt(int line) {
        super(line);
    }

    public void addTry(Statement s) {
        if (s != null) tryBody.add(s);
    }

    public void addExcept(Statement s) {
        if (s != null) exceptBodies.add(s);
    }

    public void addFinally(Statement s) {
        if (s != null) finallyBody.add(s);
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        list.addAll(tryBody);
        list.addAll(exceptBodies);
        list.addAll(finallyBody);
        return list;
    }
}
