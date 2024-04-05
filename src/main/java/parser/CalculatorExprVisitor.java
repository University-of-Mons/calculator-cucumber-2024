package parser;// Generated from D:/Ecole/Soft-evol/calculator-cucumber-2024/src/main/antlr4/calculator/CalculatorExpr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorExprParser}.
 *
 * @param <T> The return type of the visit operation.
 */
public interface CalculatorExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalculatorExprParser.ProgContext ctx);
	/**
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CalculatorExprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intInfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntInfix(CalculatorExprParser.IntInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensInfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensInfix(CalculatorExprParser.ParensInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulInfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulInfix(CalculatorExprParser.MulInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubInfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivInfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivInfix(CalculatorExprParser.DivInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPrefix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPrefix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intPrefix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntPrefix(CalculatorExprParser.IntPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensPrefix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPrefix(CalculatorExprParser.ParensPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intPostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntPostfix(CalculatorExprParser.IntPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensPostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPostfix(CalculatorExprParser.ParensPostfixContext ctx);
}