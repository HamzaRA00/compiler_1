package ast.html;

public class HtmlTextNode extends HtmlNode {
    private String text;

    public HtmlTextNode(String text) {
        this.text = text;
    }

    @Override
    public String toString(int indent) {
        String trimmedText = text.trim();
        if (trimmedText.isEmpty()) return "";
        return getIndent(indent) + "Text: \"" + trimmedText + "\"\n";
    }
}
