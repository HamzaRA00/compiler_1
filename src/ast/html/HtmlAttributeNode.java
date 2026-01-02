package ast.html;

public class HtmlAttributeNode extends HtmlNode {
    private String name;
    private String value;

    public HtmlAttributeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + "Attribute: " + name + "=" + value + "\n";
    }
}
