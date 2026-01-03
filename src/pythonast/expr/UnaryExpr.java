package pythonast.expr;

import pythonast.Expression;
import pythonast.AstNode;

import java.util.ArrayList;
import java.util.List;

public class UnaryExpr extends Expression {
    public final Expression expr;
    public final String operator;

    public UnaryExpr(int line, Expression expr, String operator) {
        super(line);
        this.expr = expr;
        this.operator = operator;
    }

    @Override
    public String nodeInfo() {
        return getClass().getSimpleName() + " line " + line + (operator != null ? " value=" + operator : "");
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (expr != null) list.add(expr);
        return list;
    }
}
