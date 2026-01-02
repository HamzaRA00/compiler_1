package ast.css;

public class CssDeclarationNode extends CssNode {
    private String property;
    private String value;

    public CssDeclarationNode(String property, String value) {
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + "Declaration: " + property + ": " + value + "\n";
    }
}
