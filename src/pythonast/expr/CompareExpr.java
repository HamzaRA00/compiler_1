package pythonast.expr;

import pythonast.Expression;

public class CompareExpr extends BinaryExpr {
    public CompareExpr(int line, Expression left, Expression right, String operator) {
        super(line, left, right, operator);
    }
}
