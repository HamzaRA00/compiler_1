package pythonast.stmt;

import pythonast.AstNode;
import pythonast.Statement;

import java.util.ArrayList;
import java.util.List;

public class DecoratedDef extends Statement {
    public final List<AstNode> children = new ArrayList<>();

    public DecoratedDef(int line) {
        super(line);
    }

    public void add(AstNode node) {
        if (node != null) children.add(node);
    }

    @Override
    public List<AstNode> children() {
        return new ArrayList<>(children);
    }
}
