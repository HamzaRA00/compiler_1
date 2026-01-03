package pythonast.expr;

import pythonast.Expression;

public class LogicalOrExpr extends BinaryExpr {
    public LogicalOrExpr(int line, Expression left, Expression right, String operator) {
        super(line, left, right, operator);
    }
}
