package ast.css;

import gen.css3Parser;
import gen.css3ParserBaseVisitor;

public class CssAstVisitor extends css3ParserBaseVisitor<CssNode> {

    private <T extends CssNode> T setLine(T node, org.antlr.v4.runtime.ParserRuleContext ctx) {
        if (node != null && ctx != null) {
            node.setLineNumber(ctx.getStart().getLine());
        }
        return node;
    }

    @Override
    public CssNode visitStylesheet(css3Parser.StylesheetContext ctx) {
        CssStylesheetNode stylesheet = new CssStylesheetNode();
        setLine(stylesheet, ctx);
        for (css3Parser.NestedStatementContext nestedCtx : ctx.nestedStatement()) {
            CssNode rule = visit(nestedCtx);
            if (rule != null) {
                stylesheet.addRule(rule);
            }
        }
        return stylesheet;
    }

    @Override
    public CssNode visitNestedStatement(css3Parser.NestedStatementContext ctx) {
        if (ctx.ruleset() != null) {
            return visit(ctx.ruleset());
        }
        return null;
    }

    @Override
    public CssNode visitKnownRuleset(css3Parser.KnownRulesetContext ctx) {
        CssRulesetNode ruleset = new CssRulesetNode();
        setLine(ruleset, ctx);
        
        // Handle selectors
        if (ctx.selectorGroup() != null) {
            for (css3Parser.SelectorContext selectorCtx : ctx.selectorGroup().selector()) {
                CssSelectorNode selectorNode = new CssSelectorNode(selectorCtx.getText());
                ruleset.addSelector(setLine(selectorNode, selectorCtx));
            }
        }

        // Handle declarations
        if (ctx.declarationList() != null) {
            for (css3Parser.DeclarationContext declCtx : ctx.declarationList().declaration()) {
                CssNode decl = visit(declCtx);
                if (decl instanceof CssDeclarationNode) {
                    ruleset.addDeclaration((CssDeclarationNode) decl);
                }
            }
        }
        
        return ruleset;
    }

    @Override
    public CssNode visitKnownDeclaration(css3Parser.KnownDeclarationContext ctx) {
        String property = ctx.property_().getText();
        String value = ctx.expr().getText();
        CssDeclarationNode declNode = new CssDeclarationNode(property, value);
        return setLine(declNode, ctx);
    }
}
