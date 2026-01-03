package pythonast.stmt;

import pythonast.AstNode;
import pythonast.Expression;
import pythonast.Statement;

import java.util.ArrayList;
import java.util.List;

public class Decorator extends Statement {
    public final Expression expr;

    public Decorator(int line, Expression expr) {
        super(line);
        this.expr = expr;
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (expr != null) list.add(expr);
        return list;
    }
}
