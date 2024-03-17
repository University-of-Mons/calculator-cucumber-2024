// Generated from /home/administrateur/Documents/cours/Mas1/Q2/Software evolution/calculator-cucumber-2024/src/main/antlr4/calculator/ParserCalculator.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserCalculatorParser}.
 */
public interface ParserCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserCalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ParserCalculatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ParserCalculatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCalculatorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ParserCalculatorParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCalculatorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ParserCalculatorParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfix(ParserCalculatorParser.InfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfix(ParserCalculatorParser.InfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCalculatorParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(ParserCalculatorParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCalculatorParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(ParserCalculatorParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCalculatorParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(ParserCalculatorParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCalculatorParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(ParserCalculatorParser.PostfixContext ctx);
}