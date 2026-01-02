package ast.html;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementNode extends HtmlNode {
    private String tagName;
    private List<HtmlAttributeNode> attributes = new ArrayList<>();
    private List<HtmlNode> children = new ArrayList<>();

    public HtmlElementNode(String tagName) {
        this.tagName = tagName;
    }

    public void addAttribute(HtmlAttributeNode attribute) {
        attributes.add(attribute);
    }

    public void addChild(HtmlNode child) {
        children.add(child);
    }

    public String getTagName() {
        return tagName;
    }

    public List<HtmlAttributeNode> getAttributes() {
        return attributes;
    }

    public List<HtmlNode> getChildren() {
        return children;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndent(indent)).append("Element: <").append(tagName).append(">");
        if (!attributes.isEmpty()) {
            sb.append(" Attributes: ");
            for (int i = 0; i < attributes.size(); i++) {
                sb.append(attributes.get(i).getName()).append("=").append(attributes.get(i).getValue());
                if (i < attributes.size() - 1) sb.append(", ");
            }
        }
        sb.append("\n");
        for (HtmlNode child : children) {
            sb.append(child.toString(indent + 1));
        }
        return sb.toString();
    }
}
