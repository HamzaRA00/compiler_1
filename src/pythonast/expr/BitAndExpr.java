package pythonast.expr;

import pythonast.Expression;

public class BitAndExpr extends BinaryExpr {
    public BitAndExpr(int line, Expression left, Expression right) {
        super(line, left, right);
    }
}

