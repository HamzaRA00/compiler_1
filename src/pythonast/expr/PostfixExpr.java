package pythonast.expr;

import pythonast.AstNode;
import pythonast.Expression;

import java.util.ArrayList;
import java.util.List;

public class PostfixExpr extends Expression {
    public final Expression base;
    public final List<Expression> args = new ArrayList<>();

    public PostfixExpr(int line, Expression base) {
        super(line);
        this.base = base;
    }

    public void addArg(Expression e) {
        if (e != null) args.add(e);
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (base != null) list.add(base);
        list.addAll(args);
        return list;
    }
}
