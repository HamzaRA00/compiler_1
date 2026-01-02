import ast.css.CssAstVisitor;
import ast.css.CssNode;
import ast.html.HtmlAstVisitor;
import ast.html.HtmlNode;
import ast.visitor.CssSemanticVisitor;
import ast.visitor.HtmlSemanticVisitor;
import gen.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import symbol.SymbolTable;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        testHtml();
    }

    private static void testHtml() throws java.io.IOException {
        String html = CharStreams.fromFileName("test.html").toString();
        
        System.out.println("Parsing HTML:");
        System.out.println(html);
        System.out.println("\nGenerated HTML AST:");

        HTMLLexer lexer = new HTMLLexer(CharStreams.fromString(html));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HTMLParser parser = new HTMLParser(tokens);
        
        HTMLParser.HtmlDocumentContext tree = parser.htmlDocument();
        System.out.println("\nGenerated HTML Parser Tree:");
        System.out.println(tree.toStringTree(parser));
        
        HtmlAstVisitor visitor = new HtmlAstVisitor();
        HtmlNode ast = visitor.visit(tree);
        
        System.out.println("\nGenerated HTML AST:");
        System.out.println(ast.toString());

        System.out.println("\nAnalyzing HTML Symbols:");
        HtmlSemanticVisitor semanticVisitor = new HtmlSemanticVisitor();
        SymbolTable symbolTable = semanticVisitor.visit(ast);
        System.out.println(symbolTable.toString());
    }

}