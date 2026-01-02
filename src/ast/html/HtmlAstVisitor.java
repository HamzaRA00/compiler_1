package ast.html;

import ast.css.CssAstVisitor;
import ast.css.CssNode;
import gen.HTMLParser;
import gen.HTMLParserBaseVisitor;
import gen.css3Lexer;
import gen.css3Parser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

public class HtmlAstVisitor extends HTMLParserBaseVisitor<HtmlNode> {

    private <T extends HtmlNode> T setLine(T node, org.antlr.v4.runtime.ParserRuleContext ctx) {
        if (node != null && ctx != null) {
            node.setLineNumber(ctx.getStart().getLine());
        }
        return node;
    }

    @Override
    public HtmlNode visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        HtmlDocumentNode document = new HtmlDocumentNode();
        setLine(document, ctx);
        for (HTMLParser.HtmlElementsContext elementCtx : ctx.htmlElements()) {
            HtmlNode node = visit(elementCtx);
            if (node != null) {
                document.addChild(node);
            }
        }
        return document;
    }

    @Override
    public HtmlNode visitHtmlElements(HTMLParser.HtmlElementsContext ctx) {
        return visit(ctx.htmlElement());
    }

    @Override
    public HtmlNode visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        if (ctx.TAG_NAME(0) != null) {
            String tagName = ctx.TAG_NAME(0).getText();
            System.out.println("Visiting HTML Element: " + tagName);
            HtmlElementNode element = new HtmlElementNode(tagName);
            setLine(element, ctx);

            for (HTMLParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
                HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
                if (attr != null) {
                    element.addAttribute(attr);
                }
            }

            if (ctx.htmlContent() != null) {
                HtmlNode content = visit(ctx.htmlContent());
                if (content instanceof HtmlDocumentNode) {
                    for (HtmlNode child : ((HtmlDocumentNode) content).getChildren()) {
                        element.addChild(child);
                    }
                }
            }
            return element;
        } else if (ctx.style() != null) {
            // Handle <style> tag content via StyleContext
            HTMLParser.StyleContext styleCtx = ctx.style();
            String styleContent = "";
            if (styleCtx.STYLE_BODY() != null) {
                styleContent = styleCtx.STYLE_BODY().getText();
                if (styleContent.toLowerCase().endsWith("</style>")) {
                    styleContent = styleContent.substring(0, styleContent.length() - "</style>".length());
                }
            } else if (styleCtx.STYLE_SHORT_BODY() != null) {
                styleContent = styleCtx.STYLE_SHORT_BODY().getText();
                if (styleContent.toLowerCase().endsWith("</>")) {
                    styleContent = styleContent.substring(0, styleContent.length() - "</>".length());
                }
            }

            if (!styleContent.isEmpty()) {
                css3Lexer cssLexer = new css3Lexer(CharStreams.fromString(styleContent));
                CommonTokenStream cssTokens = new CommonTokenStream(cssLexer);
                css3Parser cssParser = new css3Parser(cssTokens);
                css3Parser.StylesheetContext cssTree = cssParser.stylesheet();
                CssAstVisitor cssVisitor = new CssAstVisitor();
                CssNode cssAst = cssVisitor.visit(cssTree);
                HtmlStyleNode styleNode = new HtmlStyleNode(cssAst);
                return setLine(styleNode, ctx);
            }
            return null; // Empty style tag
        }
        return null;
    }

    @Override
    public HtmlNode visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        HtmlDocumentNode contentNode = new HtmlDocumentNode(); // Using this as a container
        
        for (int i = 0; i < ctx.getChildCount(); i++) {
            var child = ctx.getChild(i);
            HtmlNode childNode = visit(child);
            if (childNode != null) {
                contentNode.addChild(childNode);
            }
        }
        return contentNode;
    }

    @Override
    public HtmlNode visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        String name = ctx.TAG_NAME().getText();
        String value = ctx.ATTVALUE_VALUE() != null ? ctx.ATTVALUE_VALUE().getText() : "";
        // Remove quotes if present
        if (value.startsWith("\"") && value.endsWith("\"") || value.startsWith("'") && value.endsWith("'")) {
            value = value.substring(1, value.length() - 1);
        }
        HtmlAttributeNode attrNode = new HtmlAttributeNode(name, value);
        return setLine(attrNode, ctx);
    }

    @Override
    public HtmlNode visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        String text = ctx.getText();
        if (text.trim().isEmpty()) return null;
        HtmlTextNode textNode = new HtmlTextNode(text);
        return setLine(textNode, ctx);
    }

    @Override
    public HtmlNode visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        HtmlCommentNode commentNode = new HtmlCommentNode(ctx.getText());
        return setLine(commentNode, ctx);
    }
}
