package pythonast.expr;

import pythonast.Expression;
import pythonast.AstNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryExpr extends Expression {
    public final Expression left;
    public final Expression right;
    public final String operator;

    public BinaryExpr(int line, Expression left, Expression right, String operator) {
        super(line);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String nodeInfo() {
        return getClass().getSimpleName() + " line " + line + (operator != null ? " value=" + operator : "");
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (left != null) list.add(left);
        if (right != null) list.add(right);
        return list;
    }
}
