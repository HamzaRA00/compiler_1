package pythonast.expr;

import pythonast.Expression;

public class MulDivExpr extends BinaryExpr {
    public MulDivExpr(int line, Expression left, Expression right, String operator) {
        super(line, left, right, operator);
    }
}
