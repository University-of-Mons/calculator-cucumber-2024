package gen;// Generated from /home/marinebodson/Documents/Ecole/MASTER1/Software-Evol/calculator-cucumber-2024/src/main/antlr4/calculator/ParserCalculator.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ParserCalculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ParserCalculatorParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ParserCalculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ParserCalculatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ParserCalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ParserCalculatorParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infix_exp}
	 * labeled alternative in {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfix_exp(ParserCalculatorParser.Infix_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infix_exp}
	 * labeled alternative in {@link ParserCalculatorParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfix_exp(ParserCalculatorParser.Infix_expContext ctx);
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
}