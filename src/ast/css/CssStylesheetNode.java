package ast.css;

import java.util.ArrayList;
import java.util.List;

public class CssStylesheetNode extends CssNode {
    private List<CssNode> rules = new ArrayList<>();

    public void addRule(CssNode rule) {
        rules.add(rule);
    }

    public List<CssNode> getRules() {
        return rules;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndent(indent)).append("Stylesheet\n");
        for (CssNode rule : rules) {
            sb.append(rule.toString(indent + 1));
        }
        return sb.toString();
    }
}
