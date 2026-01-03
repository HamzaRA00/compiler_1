package pythonast.expr;

import pythonast.Expression;

public class PowerExpr extends BinaryExpr {
    public PowerExpr(int line, Expression left, Expression right, String operator) {
        super(line, left, right, operator);
    }
}
