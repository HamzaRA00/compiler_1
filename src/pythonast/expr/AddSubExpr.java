package pythonast.expr;

import pythonast.Expression;

public class AddSubExpr extends BinaryExpr {
    public AddSubExpr(int line, Expression left, Expression right) {
        super(line, left, right);
    }
}

