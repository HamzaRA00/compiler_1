package ast.visitor;

import ast.html.*;
import symbol.SymbolTable;

public class HtmlSemanticVisitor {
    private final SymbolTable symbolTable = new SymbolTable();

    public SymbolTable visit(HtmlNode node) {
        if (node instanceof HtmlDocumentNode) {
            visitDocument((HtmlDocumentNode) node);
        } else if (node instanceof HtmlStyleNode) {
            visitStyle((HtmlStyleNode) node);
        } else if (node instanceof HtmlElementNode) {
            visitElement((HtmlElementNode) node);
        } else if (node instanceof JinjaStatementNode) {
            visitJinjaStatement((JinjaStatementNode) node);
        } else if (node instanceof JinjaExpressionNode) {
            visitJinjaExpression((JinjaExpressionNode) node);
        } else if (node instanceof JinjaCommentNode) {
            visitJinjaComment((JinjaCommentNode) node);
        }
        return symbolTable;
    }

    private void visitDocument(HtmlDocumentNode node) {
        for (HtmlNode child : node.getChildren()) {
            visit(child);
        }
    }

    private void visitElement(HtmlElementNode node) {
        // Collect Tag Symbol
        symbolTable.addSymbol(node.getTagName(), "TAG", "", node.getLineNumber());

        // Collect Attributes (ID and Class are special)
        for (HtmlAttributeNode attr : node.getAttributes()) {
            String name = attr.getName();
            String value = attr.getValue();
            
            if (name.equalsIgnoreCase("id")) {
                symbolTable.addSymbol(value, "ID", node.getTagName(), attr.getLineNumber());
            } else if (name.equalsIgnoreCase("class")) {
                symbolTable.addSymbol(value, "CLASS", node.getTagName(), attr.getLineNumber());
            } else {
                symbolTable.addSymbol(name, "ATTRIBUTE", value, attr.getLineNumber());
            }
        }

        // Visit children
        for (HtmlNode child : node.getChildren()) {
            visit(child);
        }
    }

    private void visitStyle(HtmlStyleNode node) {
        CssSemanticVisitor cssSemanticVisitor = new CssSemanticVisitor();
        cssSemanticVisitor.visit(node.getCssAst());
        System.out.println("\n--- CSS Symbols (before merge) ---");
        System.out.println(cssSemanticVisitor.getSymbolTable().toString());
        // Merge the CSS symbol table into the HTML symbol table
        symbolTable.merge(cssSemanticVisitor.getSymbolTable());
    }

    private void visitJinjaStatement(JinjaStatementNode node) {
        symbolTable.addSymbol(node.getContent(), "JINJA_STATEMENT", "", node.getLineNumber());
    }

    private void visitJinjaExpression(JinjaExpressionNode node) {
        symbolTable.addSymbol(node.getContent(), "JINJA_EXPRESSION", "", node.getLineNumber());
    }

    private void visitJinjaComment(JinjaCommentNode node) {
        symbolTable.addSymbol(node.getContent(), "JINJA_COMMENT", "", node.getLineNumber());
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
