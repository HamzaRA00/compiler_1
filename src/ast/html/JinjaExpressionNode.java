package ast.html;

public class JinjaExpressionNode extends HtmlNode {
    private String content;

    public JinjaExpressionNode(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + "Jinja Expression: " + content + "\n";
    }
}
