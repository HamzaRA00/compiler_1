package pythonast.stmt;

import pythonast.AstNode;
import pythonast.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionDef extends Statement {
    public final String name;
    public final List<AstNode> body = new ArrayList<>();

    public FunctionDef(int line, String name) {
        super(line);
        this.name = name;
    }

    public void addToBody(AstNode node) {
        if (node != null) body.add(node);
    }

    @Override
    public List<AstNode> children() {
        return new ArrayList<>(body);
    }
}

