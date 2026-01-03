package pythonast.expr;

import pythonast.Expression;

public class ShiftExpr extends BinaryExpr {
    public ShiftExpr(int line, Expression left, Expression right) {
        super(line, left, right);
    }
}

