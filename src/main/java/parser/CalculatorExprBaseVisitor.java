package parser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CalculatorExprVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class CalculatorExprBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CalculatorExprVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitProg(CalculatorExprParser.ProgContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitExp(CalculatorExprParser.ExpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitIntInfix(CalculatorExprParser.IntInfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitParensInfix(CalculatorExprParser.ParensInfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMulInfix(CalculatorExprParser.MulInfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitDivInfix(CalculatorExprParser.DivInfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitIntPrefix(CalculatorExprParser.IntPrefixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitParensPrefix(CalculatorExprParser.ParensPrefixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitIntPostfix(CalculatorExprParser.IntPostfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 */
	@Override public T visitParensPostfix(CalculatorExprParser.ParensPostfixContext ctx) { return visitChildren(ctx); }
}