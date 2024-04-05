// Generated from calculator.g4 by ANTLR 4.7.1

package back.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalculatorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivInfix}
	 * labeled alternative in {@link CalculatorParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivInfix(CalculatorParser.MulDivInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensInfix}
	 * labeled alternative in {@link CalculatorParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensInfix(CalculatorParser.ParensInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link CalculatorParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubInfix(CalculatorParser.AddSubInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberInfix}
	 * labeled alternative in {@link CalculatorParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInfix(CalculatorParser.NumberInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link CalculatorParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPrefix(CalculatorParser.MulDivPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link CalculatorParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPrefix(CalculatorParser.AddSubPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensPrefix}
	 * labeled alternative in {@link CalculatorParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPrefix(CalculatorParser.ParensPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberPrefix}
	 * labeled alternative in {@link CalculatorParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPrefix(CalculatorParser.NumberPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link CalculatorParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPostfix(CalculatorParser.MulDivPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link CalculatorParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPostfix(CalculatorParser.AddSubPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensPostfix}
	 * labeled alternative in {@link CalculatorParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPostfix(CalculatorParser.ParensPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberPostfix}
	 * labeled alternative in {@link CalculatorParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPostfix(CalculatorParser.NumberPostfixContext ctx);
}