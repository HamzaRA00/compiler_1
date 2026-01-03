package pythonast.expr;

import pythonast.Expression;

public class BitXorExpr extends BinaryExpr {
    public BitXorExpr(int line, Expression left, Expression right) {
        super(line, left, right);
    }
}

