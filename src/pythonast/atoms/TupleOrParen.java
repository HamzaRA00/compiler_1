package pythonast.atoms;

import pythonast.AstNode;
import pythonast.Expression;

import java.util.ArrayList;
import java.util.List;

public class TupleOrParen extends Expression {
    public final List<Expression> elements = new ArrayList<>();

    public TupleOrParen(int line) {
        super(line);
    }

    public void add(Expression e) {
        if (e != null) elements.add(e);
    }

    @Override
    public List<AstNode> children() {
        return new ArrayList<>(elements);
    }
}

