package ast.css;

public class CssSelectorNode extends CssNode {
    private String selector;

    public CssSelectorNode(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + "Selector: " + selector + "\n";
    }
}
