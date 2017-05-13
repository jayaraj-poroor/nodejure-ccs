// Generated from ShelloidQueryParser.g4 by ANTLR 4.5
package com.shelloid.query;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShelloidQueryParser}.
 */
public interface ShelloidQueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ShelloidQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ShelloidQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#samplingClause}.
	 * @param ctx the parse tree
	 */
	void enterSamplingClause(ShelloidQueryParser.SamplingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#samplingClause}.
	 * @param ctx the parse tree
	 */
	void exitSamplingClause(ShelloidQueryParser.SamplingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#samplingPeriod}.
	 * @param ctx the parse tree
	 */
	void enterSamplingPeriod(ShelloidQueryParser.SamplingPeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#samplingPeriod}.
	 * @param ctx the parse tree
	 */
	void exitSamplingPeriod(ShelloidQueryParser.SamplingPeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#samplingEvents}.
	 * @param ctx the parse tree
	 */
	void enterSamplingEvents(ShelloidQueryParser.SamplingEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#samplingEvents}.
	 * @param ctx the parse tree
	 */
	void exitSamplingEvents(ShelloidQueryParser.SamplingEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#priority}.
	 * @param ctx the parse tree
	 */
	void enterPriority(ShelloidQueryParser.PriorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#priority}.
	 * @param ctx the parse tree
	 */
	void exitPriority(ShelloidQueryParser.PriorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(ShelloidQueryParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(ShelloidQueryParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(ShelloidQueryParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(ShelloidQueryParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#simpleName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleName(ShelloidQueryParser.SimpleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#simpleName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleName(ShelloidQueryParser.SimpleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ShelloidQueryParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ShelloidQueryParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(ShelloidQueryParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(ShelloidQueryParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#selectTerm}.
	 * @param ctx the parse tree
	 */
	void enterSelectTerm(ShelloidQueryParser.SelectTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#selectTerm}.
	 * @param ctx the parse tree
	 */
	void exitSelectTerm(ShelloidQueryParser.SelectTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(ShelloidQueryParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(ShelloidQueryParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(ShelloidQueryParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(ShelloidQueryParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(ShelloidQueryParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(ShelloidQueryParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#commonExpr}.
	 * @param ctx the parse tree
	 */
	void enterCommonExpr(ShelloidQueryParser.CommonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#commonExpr}.
	 * @param ctx the parse tree
	 */
	void exitCommonExpr(ShelloidQueryParser.CommonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(ShelloidQueryParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(ShelloidQueryParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(ShelloidQueryParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(ShelloidQueryParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(ShelloidQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(ShelloidQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ShelloidQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ShelloidQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#setupClause}.
	 * @param ctx the parse tree
	 */
	void enterSetupClause(ShelloidQueryParser.SetupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#setupClause}.
	 * @param ctx the parse tree
	 */
	void exitSetupClause(ShelloidQueryParser.SetupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#teardownClause}.
	 * @param ctx the parse tree
	 */
	void enterTeardownClause(ShelloidQueryParser.TeardownClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#teardownClause}.
	 * @param ctx the parse tree
	 */
	void exitTeardownClause(ShelloidQueryParser.TeardownClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#actionClause}.
	 * @param ctx the parse tree
	 */
	void enterActionClause(ShelloidQueryParser.ActionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#actionClause}.
	 * @param ctx the parse tree
	 */
	void exitActionClause(ShelloidQueryParser.ActionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShelloidQueryParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ShelloidQueryParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShelloidQueryParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ShelloidQueryParser.ScriptContext ctx);
}