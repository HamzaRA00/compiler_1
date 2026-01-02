package ast.html;

public class HtmlCommentNode extends HtmlNode {
    private String comment;

    public HtmlCommentNode(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString(int indent) {
        return getIndent(indent) + "Comment: " + comment.trim() + "\n";
    }
}
