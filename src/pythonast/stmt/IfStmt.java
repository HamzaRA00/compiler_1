package pythonast.stmt;

import pythonast.AstNode;
import pythonast.Expression;
import pythonast.Statement;

import java.util.ArrayList;
import java.util.List;

public class IfStmt extends Statement {
    public final Expression condition;
    public final List<Statement> thenBody = new ArrayList<>();
    public final List<Statement> elseBody = new ArrayList<>();

    public IfStmt(int line, Expression condition) {
        super(line);
        this.condition = condition;
    }

    public void addThen(Statement s) {
        if (s != null) thenBody.add(s);
    }

    public void addElse(Statement s) {
        if (s != null) elseBody.add(s);
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (condition != null) list.add(condition);
        list.addAll(thenBody);
        list.addAll(elseBody);
        return list;
    }
}

