package pythonast.visitor;

import antlr.FinalPythonParser;
import antlr.FinalPythonParserBaseVisitor;
import pythonast.ProgramAst;
import pythonast.Statement;

public class PythonAntlrToProgram extends FinalPythonParserBaseVisitor<ProgramAst> {
    private final PythonAntlrToStatement stmtVisitor = new PythonAntlrToStatement();

    @Override
    public ProgramAst visitProgram(FinalPythonParser.ProgramContext ctx) {
        ProgramAst prog = new ProgramAst(ctx.start.getLine());
        for (FinalPythonParser.StatementContext sctx : ctx.statement()) {
            Statement s = stmtVisitor.visit(sctx);
            prog.addStatement(s);
        }
        return prog;
    }
}
