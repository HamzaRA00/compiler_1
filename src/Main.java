import antlr.FinalPythonLexer;
import antlr.FinalPythonParser;
import ast.css.CssAstVisitor;
import ast.css.CssNode;
import ast.html.HtmlAstVisitor;
import ast.html.HtmlNode;
import ast.visitor.CssSemanticVisitor;
import ast.visitor.HtmlSemanticVisitor;
import gen.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import pythonast.AstPrinter;
import pythonast.ProgramAst;
import pythonast.symbols.SymbolPrinter;
import pythonast.visitor.PythonAntlrToProgram;
import pythonast.visitor.SymbolBuilder;
import symbol.SymbolTable;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        testHtml();
        testPython();
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

    private static void testPython() throws java.io.IOException {
        String python = CharStreams.fromFileName("test0.py").toString();

        System.out.println("Parsing Python:");
        System.out.println(python);
        System.out.println("\nGenerated Python AST:");

        FinalPythonLexer lexer = new FinalPythonLexer(CharStreams.fromString(python));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FinalPythonParser parser = new FinalPythonParser(tokens);
        ParseTree tree = parser.program();
        PythonAntlrToProgram progVisitor = new PythonAntlrToProgram();
        ProgramAst programAst = progVisitor.visit(tree);
        AstPrinter printer = new AstPrinter();
        for (String line : printer.print(programAst)) {
            System.out.println(line);
        }
        System.out.println("\nAnalyzing Python Symbols:");
        SymbolBuilder sb = new SymbolBuilder(programAst);
        pythonast.symbols.SymbolTable table = sb.getTable();
        SymbolPrinter sp = new SymbolPrinter();
        for (String line : sp.print(table)) {
            System.out.println(line);
        }
    }


}