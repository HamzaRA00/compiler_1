package pythonast.stmt;

import pythonast.AstNode;
import pythonast.Statement;

import java.util.ArrayList;
import java.util.List;

public class ClassDef extends Statement {
    public final String name;
    public final List<AstNode> body = new ArrayList<>();

    public ClassDef(int line, String name) {
        super(line);
        this.name = name;
    }

    @Override
    public String nodeInfo() {
        return getClass().getSimpleName() + " line " + line + " name=" + name;
    }

    public void addToBody(AstNode node) {
        if (node != null) body.add(node);
    }

    @Override
    public List<AstNode> children() {
        return new ArrayList<>(body);
    }
}

