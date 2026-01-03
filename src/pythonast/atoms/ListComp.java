package pythonast.atoms;

import pythonast.AstNode;
import pythonast.Expression;

import java.util.ArrayList;
import java.util.List;

public class ListComp extends Expression {
    public final List<Expression> parts = new ArrayList<>();

    public ListComp(int line) {
        super(line);
    }

    public void add(Expression e) {
        if (e != null) parts.add(e);
    }

    @Override
    public List<AstNode> children() {
        return new ArrayList<>(parts);
    }
}
