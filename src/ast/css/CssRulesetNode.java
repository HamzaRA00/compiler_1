package ast.css;

import java.util.ArrayList;
import java.util.List;

public class CssRulesetNode extends CssNode {
    private List<CssSelectorNode> selectors = new ArrayList<>();
    private List<CssDeclarationNode> declarations = new ArrayList<>();

    public void addSelector(CssSelectorNode selector) {
        selectors.add(selector);
    }

    public void addDeclaration(CssDeclarationNode declaration) {
        declarations.add(declaration);
    }

    public List<CssSelectorNode> getSelectors() {
        return selectors;
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndent(indent)).append("Ruleset\n");
        sb.append(getIndent(indent + 1)).append("Selectors:\n");
        for (CssSelectorNode selector : selectors) {
            sb.append(selector.toString(indent + 2));
        }
        sb.append(getIndent(indent + 1)).append("Declarations:\n");
        for (CssDeclarationNode declaration : declarations) {
            sb.append(declaration.toString(indent + 2));
        }
        return sb.toString();
    }
}
