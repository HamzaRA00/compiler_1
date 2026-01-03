package pythonast.expr;

import pythonast.Expression;
import pythonast.AstNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryExpr extends Expression {
    public final Expression left;
    public final Expression right;

    public BinaryExpr(int line, Expression left, Expression right) {
        super(line);
        this.left = left;
        this.right = right;
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (left != null) list.add(left);
        if (right != null) list.add(right);
        return list;
    }
}

