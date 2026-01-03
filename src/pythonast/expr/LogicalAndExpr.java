package pythonast.expr;

import pythonast.Expression;

public class LogicalAndExpr extends BinaryExpr {
    public LogicalAndExpr(int line, Expression left, Expression right) {
        super(line, left, right);
    }
}

