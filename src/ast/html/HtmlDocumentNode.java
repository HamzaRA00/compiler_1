package ast.html;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocumentNode extends HtmlNode {
    private List<HtmlNode> children = new ArrayList<>();


    public void addChild(HtmlNode node) {
        children.add(node);
    }

    public List<HtmlNode> getChildren() {
        return children;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndent(indent)).append("Document\n");
        for (HtmlNode child : children) {
            sb.append(child.toString(indent + 1));
        }
        return sb.toString();
    }
}
