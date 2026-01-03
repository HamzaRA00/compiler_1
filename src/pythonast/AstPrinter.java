package pythonast;

import java.util.ArrayList;
import java.util.List;

public class AstPrinter {
    public List<String> print(AstNode node) {
        List<String> out = new ArrayList<>();
        walk(node, out, 0);
        return out;
    }

    private void walk(AstNode node, List<String> out, int depth) {
        if (node == null) return;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) sb.append("  ");
        sb.append(node.nodeInfo());
        out.add(sb.toString());
        List<AstNode> kids = new ArrayList<>(node.children());
        kids.sort((a, b) -> Integer.compare(a.line, b.line));
        for (AstNode child : kids) {
            walk(child, out, depth + 1);
        }
    }
}
