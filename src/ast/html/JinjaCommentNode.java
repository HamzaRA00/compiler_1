package ast.html;

public class JinjaCommentNode extends HtmlNode {
    private String content;

    public JinjaCommentNode(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + "Jinja Comment: " + content + "\n";
    }
}
