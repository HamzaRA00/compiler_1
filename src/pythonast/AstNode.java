package pythonast;

import java.util.Collections;
import java.util.List;

public abstract class AstNode {
    public final int line;

    public AstNode(int line) {
        this.line = line;
    }

    public String nodeInfo() {
        return getClass().getSimpleName() + " line " + line;
    }

    @Override
    public String toString() {
        return nodeInfo();
    }

    public List<AstNode> children() {
        return Collections.emptyList();
    }
}

