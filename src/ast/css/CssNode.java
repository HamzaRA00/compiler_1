package ast.css;

public abstract class CssNode {
    private int lineNumber;

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public abstract String toString(int indent);

    @Override
    public String toString() {
        return toString(0);
    }

    protected String getIndent(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }
}
