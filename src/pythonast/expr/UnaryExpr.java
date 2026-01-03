package pythonast.expr;

import pythonast.Expression;
import pythonast.AstNode;

import java.util.ArrayList;
import java.util.List;

public class UnaryExpr extends Expression {
    public final Expression expr;

    public UnaryExpr(int line, Expression expr) {
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

