package pythonast.expr;

import pythonast.Expression;

public class NotInExpr extends BinaryExpr {
    public NotInExpr(int line, Expression left, Expression right) {
        super(line, left, right);
    }
}

