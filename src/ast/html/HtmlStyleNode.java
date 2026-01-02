package ast.html;

import ast.css.CssNode;

public class HtmlStyleNode extends HtmlNode {
    private CssNode cssAst;

    public HtmlStyleNode(CssNode cssAst) {
        this.cssAst = cssAst;
    }

    public CssNode getCssAst() {
        return cssAst;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndent(indent)).append("Style\n");
        // Indent the CSS AST representation
        String cssAstString = cssAst.toString();
        for (String line : cssAstString.split("\n")) {
            sb.append(getIndent(indent + 1)).append(line).append("\n");
        }
        return sb.toString();
    }
}