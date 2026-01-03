package ast.html;

public class JinjaStatementNode extends HtmlNode {
    private String content;

    public JinjaStatementNode(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + "Jinja Statement: " + content + "\n";
    }
}
