// Generated from src/antlr/FinalPythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FinalPythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FinalPythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FinalPythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link FinalPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(FinalPythonParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link FinalPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(FinalPythonParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(FinalPythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotatedAssignmentStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedAssignmentStmt(FinalPythonParser.AnnotatedAssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(FinalPythonParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(FinalPythonParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassStmt(FinalPythonParser.PassStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlowStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowStmt(FinalPythonParser.FlowStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmt(FinalPythonParser.AssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStmt(FinalPythonParser.GlobalStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonlocalStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocalStmt(FinalPythonParser.NonlocalStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DelStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelStmt(FinalPythonParser.DelStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link FinalPythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(FinalPythonParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOnlyStmt}
	 * labeled alternative in {@link FinalPythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOnlyStmt(FinalPythonParser.ExprOnlyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotatedAssign}
	 * labeled alternative in {@link FinalPythonParser#annotated_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedAssign(FinalPythonParser.AnnotatedAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmtFull}
	 * labeled alternative in {@link FinalPythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmtFull(FinalPythonParser.ImportStmtFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link FinalPythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStmt(FinalPythonParser.FromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(FinalPythonParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(FinalPythonParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(FinalPythonParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(FinalPythonParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(FinalPythonParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(FinalPythonParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(FinalPythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RaiseStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseStmt(FinalPythonParser.RaiseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStmt(FinalPythonParser.YieldStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(FinalPythonParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(FinalPythonParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(FinalPythonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(FinalPythonParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(FinalPythonParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(FinalPythonParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(FinalPythonParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(FinalPythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(FinalPythonParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(FinalPythonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(FinalPythonParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(FinalPythonParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStmt(FinalPythonParser.TryStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(FinalPythonParser.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(FinalPythonParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(FinalPythonParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedDef(FinalPythonParser.DecoratedDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(FinalPythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(FinalPythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(FinalPythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(FinalPythonParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(FinalPythonParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(FinalPythonParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(FinalPythonParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(FinalPythonParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FinalPythonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(FinalPythonParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(FinalPythonParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedFunction}
	 * labeled alternative in {@link FinalPythonParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedFunction(FinalPythonParser.DecoratedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedClass}
	 * labeled alternative in {@link FinalPythonParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedClass(FinalPythonParser.DecoratedClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(FinalPythonParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link FinalPythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSuite(FinalPythonParser.BlockSuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleSuite}
	 * labeled alternative in {@link FinalPythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSuite(FinalPythonParser.SimpleSuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link FinalPythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArg(FinalPythonParser.PositionalArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link FinalPythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArg(FinalPythonParser.KeywordArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNotExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotExpr(FinalPythonParser.IsNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAndExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpr(FinalPythonParser.BitAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(FinalPythonParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOrExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpr(FinalPythonParser.BitOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(FinalPythonParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(FinalPythonParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(FinalPythonParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(FinalPythonParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(FinalPythonParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(FinalPythonParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(FinalPythonParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(FinalPythonParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(FinalPythonParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(FinalPythonParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpr(FinalPythonParser.ShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitXorExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXorExpr(FinalPythonParser.BitXorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInExpr(FinalPythonParser.NotInExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAtom(FinalPythonParser.NameAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(FinalPythonParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(FinalPythonParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneAtom(FinalPythonParser.NoneAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(FinalPythonParser.TrueAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(FinalPythonParser.FalseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(FinalPythonParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(FinalPythonParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneratorExpr}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorExpr(FinalPythonParser.GeneratorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleOrParen}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleOrParen(FinalPythonParser.TupleOrParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComp(FinalPythonParser.ListCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictComp}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictComp(FinalPythonParser.DictCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(FinalPythonParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#list_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_comp(FinalPythonParser.List_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#dict_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_comp(FinalPythonParser.Dict_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalPythonParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(FinalPythonParser.Comp_forContext ctx);
}