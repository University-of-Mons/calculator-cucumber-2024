// Generated from /home/administrateur/Documents/cours/Mas1/Q2/Software evolution/calculator-cucumber-2024/src/main/antlr4/calculator/ParserCalculator.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserCalculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ParserCalculatorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCalculatorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ParserCalculatorParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix(ParserCalculatorParser.InfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCalculatorParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(ParserCalculatorParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCalculatorParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(ParserCalculatorParser.PostfixContext ctx);
}