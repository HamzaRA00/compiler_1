package ast.visitor;

import ast.css.*;
import symbol.SymbolTable;

public class CssSemanticVisitor {
    private final SymbolTable symbolTable = new SymbolTable();

    public SymbolTable visit(CssNode node) {
        if (node instanceof CssStylesheetNode) {
            visitStylesheet((CssStylesheetNode) node);
        } else if (node instanceof CssRulesetNode) {
            visitRuleset((CssRulesetNode) node);
        }
        return symbolTable;
    }

    private void visitStylesheet(CssStylesheetNode node) {
        for (CssNode rule : node.getRules()) {
            visit(rule);
        }
    }

    private void visitRuleset(CssRulesetNode node) {
        // Collect Selectors
        for (CssSelectorNode selector : node.getSelectors()) {
            String sel = selector.getSelector();
            String type = "SELECTOR";
            
            if (sel.startsWith(".")) {
                type = "CLASS_SELECTOR";
            } else if (sel.startsWith("#")) {
                type = "ID_SELECTOR";
            } else {
                type = "TAG_SELECTOR";
            }
            
            symbolTable.addSymbol(sel, type, "", selector.getLineNumber());
        }

        // Collect Declarations
        for (CssDeclarationNode decl : node.getDeclarations()) {
            symbolTable.addSymbol(decl.getProperty(), "PROPERTY", decl.getValue(), decl.getLineNumber());
        }
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
