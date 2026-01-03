package pythonast.expr;

import pythonast.Expression;

public class IsNotExpr extends BinaryExpr {
    public IsNotExpr(int line, Expression left, Expression right) {
        super(line, left, right);
    }
}

