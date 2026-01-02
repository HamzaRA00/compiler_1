package ast.html;

public abstract class HtmlNode {
    private int lineNumber;

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public abstract String toString(int indent);
    
    protected String getIndent(int indent) {
        return "  ".repeat(indent);
    }

    @Override
    public String toString() {
        return toString(0);
    }
}
