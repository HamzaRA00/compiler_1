package pythonast.expr;

import pythonast.AstNode;
import pythonast.Expression;

import java.util.ArrayList;
import java.util.List;

public class ConditionalExpr extends Expression {
    public final Expression expr;
    public final Expression condition;
    public final Expression elseExpr;

    public ConditionalExpr(int line, Expression expr, Expression condition, Expression elseExpr) {
        super(line);
        this.expr = expr;
        this.condition = condition;
        this.elseExpr = elseExpr;
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (expr != null) list.add(expr);
        if (condition != null) list.add(condition);
        if (elseExpr != null) list.add(elseExpr);
        return list;
    }
}

