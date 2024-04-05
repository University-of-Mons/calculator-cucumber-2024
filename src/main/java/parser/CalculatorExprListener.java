package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorExprParser}.
 */
public interface CalculatorExprListener extends ParseTreeListener {
	/**
	 * @param ctx the parse tree
	 */
	void enterProg(CalculatorExprParser.ProgContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void exitProg(CalculatorExprParser.ProgContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void enterExp(CalculatorExprParser.ExpContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void exitExp(CalculatorExprParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intInfix}
	 * @param ctx the parse tree
	 */
	void enterIntInfix(CalculatorExprParser.IntInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intInfix}
	 * @param ctx the parse tree
	 */
	void exitIntInfix(CalculatorExprParser.IntInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensInfix}
	 * @param ctx the parse tree
	 */
	void enterParensInfix(CalculatorExprParser.ParensInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensInfix}
	 * @param ctx the parse tree
	 */
	void exitParensInfix(CalculatorExprParser.ParensInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulInfix}
	 * @param ctx the parse tree
	 */
	void enterMulInfix(CalculatorExprParser.MulInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulInfix}
	 * @param ctx the parse tree
	 */
	void exitMulInfix(CalculatorExprParser.MulInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubInfix}
	 * @param ctx the parse tree
	 */
	void enterAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubInfix}
	 * @param ctx the parse tree
	 */
	void exitAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivInfix}
	 * @param ctx the parse tree
	 */
	void enterDivInfix(CalculatorExprParser.DivInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivInfix}
	 * @param ctx the parse tree
	 */
	void exitDivInfix(CalculatorExprParser.DivInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivPrefix}
	 * @param ctx the parse tree
	 */
	void enterMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivPrefix}
	 * @param ctx the parse tree
	 */
	void exitMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPrefix}
	 * @param ctx the parse tree
	 */
	void enterAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPrefix}
	 * @param ctx the parse tree
	 */
	void exitAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intPrefix}
	 * @param ctx the parse tree
	 */
	void enterIntPrefix(CalculatorExprParser.IntPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intPrefix}
	 * @param ctx the parse tree
	 */
	void exitIntPrefix(CalculatorExprParser.IntPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensPrefix}
	 * @param ctx the parse tree
	 */
	void enterParensPrefix(CalculatorExprParser.ParensPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensPrefix}
	 * @param ctx the parse tree
	 */
	void exitParensPrefix(CalculatorExprParser.ParensPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivPostfix}
	 * @param ctx the parse tree
	 */
	void enterMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivPostfix}
	 * @param ctx the parse tree
	 */
	void exitMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPostfix}
	 * @param ctx the parse tree
	 */
	void enterAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPostfix}
	 * @param ctx the parse tree
	 */
	void exitAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intPostfix}
	 * @param ctx the parse tree
	 */
	void enterIntPostfix(CalculatorExprParser.IntPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intPostfix}
	 * @param ctx the parse tree
	 */
	void exitIntPostfix(CalculatorExprParser.IntPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensPostfix}
	 * @param ctx the parse tree
	 */
	void enterParensPostfix(CalculatorExprParser.ParensPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensPostfix}
	 * @param ctx the parse tree
	 */
	void exitParensPostfix(CalculatorExprParser.ParensPostfixContext ctx);
}