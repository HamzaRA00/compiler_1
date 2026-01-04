// Generated from src/antlr/FinalPythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FinalPythonParser}.
 */
public interface FinalPythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FinalPythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FinalPythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link FinalPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(FinalPythonParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link FinalPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(FinalPythonParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link FinalPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(FinalPythonParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link FinalPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(FinalPythonParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(FinalPythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(FinalPythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotatedAssignmentStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedAssignmentStmt(FinalPythonParser.AnnotatedAssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotatedAssignmentStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedAssignmentStmt(FinalPythonParser.AnnotatedAssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(FinalPythonParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(FinalPythonParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(FinalPythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(FinalPythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPassStmt(FinalPythonParser.PassStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPassStmt(FinalPythonParser.PassStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlowStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlowStmt(FinalPythonParser.FlowStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlowStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlowStmt(FinalPythonParser.FlowStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(FinalPythonParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(FinalPythonParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStmt(FinalPythonParser.GlobalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStmt(FinalPythonParser.GlobalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonlocalStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocalStmt(FinalPythonParser.NonlocalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonlocalStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocalStmt(FinalPythonParser.NonlocalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DelStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelStmt(FinalPythonParser.DelStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DelStmt}
	 * labeled alternative in {@link FinalPythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelStmt(FinalPythonParser.DelStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link FinalPythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(FinalPythonParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link FinalPythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(FinalPythonParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOnlyStmt}
	 * labeled alternative in {@link FinalPythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprOnlyStmt(FinalPythonParser.ExprOnlyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOnlyStmt}
	 * labeled alternative in {@link FinalPythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprOnlyStmt(FinalPythonParser.ExprOnlyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotatedAssign}
	 * labeled alternative in {@link FinalPythonParser#annotated_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedAssign(FinalPythonParser.AnnotatedAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotatedAssign}
	 * labeled alternative in {@link FinalPythonParser#annotated_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedAssign(FinalPythonParser.AnnotatedAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmtFull}
	 * labeled alternative in {@link FinalPythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmtFull(FinalPythonParser.ImportStmtFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmtFull}
	 * labeled alternative in {@link FinalPythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmtFull(FinalPythonParser.ImportStmtFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link FinalPythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStmt(FinalPythonParser.FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link FinalPythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStmt(FinalPythonParser.FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(FinalPythonParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(FinalPythonParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(FinalPythonParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(FinalPythonParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(FinalPythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(FinalPythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(FinalPythonParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(FinalPythonParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(FinalPythonParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(FinalPythonParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(FinalPythonParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(FinalPythonParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(FinalPythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(FinalPythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(FinalPythonParser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(FinalPythonParser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(FinalPythonParser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldStmt}
	 * labeled alternative in {@link FinalPythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(FinalPythonParser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(FinalPythonParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(FinalPythonParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(FinalPythonParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(FinalPythonParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(FinalPythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(FinalPythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(FinalPythonParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(FinalPythonParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(FinalPythonParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(FinalPythonParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(FinalPythonParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(FinalPythonParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(FinalPythonParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(FinalPythonParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(FinalPythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(FinalPythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(FinalPythonParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(FinalPythonParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(FinalPythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(FinalPythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(FinalPythonParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(FinalPythonParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(FinalPythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(FinalPythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(FinalPythonParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(FinalPythonParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(FinalPythonParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(FinalPythonParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(FinalPythonParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(FinalPythonParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(FinalPythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(FinalPythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedDef(FinalPythonParser.DecoratedDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedDef}
	 * labeled alternative in {@link FinalPythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedDef(FinalPythonParser.DecoratedDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(FinalPythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(FinalPythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(FinalPythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(FinalPythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(FinalPythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(FinalPythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(FinalPythonParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(FinalPythonParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(FinalPythonParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(FinalPythonParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(FinalPythonParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(FinalPythonParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(FinalPythonParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(FinalPythonParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(FinalPythonParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(FinalPythonParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FinalPythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FinalPythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(FinalPythonParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(FinalPythonParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(FinalPythonParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(FinalPythonParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedFunction}
	 * labeled alternative in {@link FinalPythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedFunction(FinalPythonParser.DecoratedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedFunction}
	 * labeled alternative in {@link FinalPythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedFunction(FinalPythonParser.DecoratedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedClass}
	 * labeled alternative in {@link FinalPythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedClass(FinalPythonParser.DecoratedClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedClass}
	 * labeled alternative in {@link FinalPythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedClass(FinalPythonParser.DecoratedClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(FinalPythonParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(FinalPythonParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link FinalPythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterBlockSuite(FinalPythonParser.BlockSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link FinalPythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitBlockSuite(FinalPythonParser.BlockSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleSuite}
	 * labeled alternative in {@link FinalPythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSuite(FinalPythonParser.SimpleSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleSuite}
	 * labeled alternative in {@link FinalPythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSuite(FinalPythonParser.SimpleSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link FinalPythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArg(FinalPythonParser.PositionalArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link FinalPythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArg(FinalPythonParser.PositionalArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link FinalPythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArg(FinalPythonParser.KeywordArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link FinalPythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArg(FinalPythonParser.KeywordArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpr(FinalPythonParser.IsNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpr(FinalPythonParser.IsNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpr(FinalPythonParser.BitAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpr(FinalPythonParser.BitAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(FinalPythonParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(FinalPythonParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpr(FinalPythonParser.BitOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpr(FinalPythonParser.BitOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(FinalPythonParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(FinalPythonParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(FinalPythonParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(FinalPythonParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(FinalPythonParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(FinalPythonParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(FinalPythonParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(FinalPythonParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(FinalPythonParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(FinalPythonParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(FinalPythonParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(FinalPythonParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(FinalPythonParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(FinalPythonParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(FinalPythonParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(FinalPythonParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(FinalPythonParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(FinalPythonParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(FinalPythonParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(FinalPythonParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(FinalPythonParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(FinalPythonParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXorExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitXorExpr(FinalPythonParser.BitXorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXorExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitXorExpr(FinalPythonParser.BitXorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpr(FinalPythonParser.NotInExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInExpr}
	 * labeled alternative in {@link FinalPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpr(FinalPythonParser.NotInExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNameAtom(FinalPythonParser.NameAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNameAtom(FinalPythonParser.NameAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(FinalPythonParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(FinalPythonParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(FinalPythonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(FinalPythonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNoneAtom(FinalPythonParser.NoneAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNoneAtom(FinalPythonParser.NoneAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(FinalPythonParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(FinalPythonParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(FinalPythonParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(FinalPythonParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(FinalPythonParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(FinalPythonParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(FinalPythonParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(FinalPythonParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorExpr}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorExpr(FinalPythonParser.GeneratorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorExpr}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorExpr(FinalPythonParser.GeneratorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleOrParen}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTupleOrParen(FinalPythonParser.TupleOrParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleOrParen}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTupleOrParen(FinalPythonParser.TupleOrParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListComp(FinalPythonParser.ListCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListComp(FinalPythonParser.ListCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictComp}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictComp(FinalPythonParser.DictCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictComp}
	 * labeled alternative in {@link FinalPythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictComp(FinalPythonParser.DictCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(FinalPythonParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(FinalPythonParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#list_comp}.
	 * @param ctx the parse tree
	 */
	void enterList_comp(FinalPythonParser.List_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#list_comp}.
	 * @param ctx the parse tree
	 */
	void exitList_comp(FinalPythonParser.List_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#dict_comp}.
	 * @param ctx the parse tree
	 */
	void enterDict_comp(FinalPythonParser.Dict_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#dict_comp}.
	 * @param ctx the parse tree
	 */
	void exitDict_comp(FinalPythonParser.Dict_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalPythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(FinalPythonParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalPythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(FinalPythonParser.Comp_forContext ctx);
}