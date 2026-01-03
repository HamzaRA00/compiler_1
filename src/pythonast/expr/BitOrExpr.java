package pythonast.expr;

import pythonast.Expression;

public class BitOrExpr extends BinaryExpr {
    public BitOrExpr(int line, Expression left, Expression right) {
        super(line, left, right);
    }
}

