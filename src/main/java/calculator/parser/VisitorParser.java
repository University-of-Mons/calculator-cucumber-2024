package calculator.parser;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.operation.Divides;
import calculator.operation.Minus;
import calculator.operation.Plus;
import calculator.operation.Times;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class VisitorParser<T> extends CalculatorBaseVisitor<Expression<T>> {

    private final Parser.From<T> baseParser;

    public VisitorParser(Parser.From<T> baseParser) {
        super();
        this.baseParser = baseParser;
    }

    @Override
    public Expression<T> visitEquation(CalculatorParser.EquationContext ctx) {
        return visit(ctx.expression(0));
    }

    @Override
    public Expression<T> visitExpression(CalculatorParser.ExpressionContext ctx) {
        log.trace("Visit expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // multiplyingExpression
            return visit(ctx.multiplyingExpression());
        } else if (ctx.children.size() == 3) {
            // expression (PLUS | MINUS) multiplyingExpression
            List<Expression<T>> insideExpression = new ArrayList<>();
            insideExpression.add(visit(ctx.expression()));
            insideExpression.add(visit(ctx.multiplyingExpression()));

            String op = ctx.children.get(1).getText();
            try {
                if (op.equals("+")) {
                    log.trace("Create plus : {}", insideExpression);
                    return new Plus<>(insideExpression);
                } else if (op.equals("-")) {
                    return new Minus<>(insideExpression);
                }
            } catch (IllegalConstruction e) {
                log.warn("Could not create Operation");
                return null;
            }
        }
        log.error("Illegal expression");
        return null;
    }

    @Override
    public Expression<T> visitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        log.trace("Visit multiplying expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // powExpression
            return visit(ctx.powExpression());
        } else if (ctx.children.size() == 3) {
            // multiplyingExpression (TIMES | DIV) powExpression
            List<Expression<T>> insideExpression = new ArrayList<>();
            insideExpression.add(visit(ctx.multiplyingExpression()));
            insideExpression.add(visit(ctx.powExpression()));

            String op = ctx.children.get(1).getText();
            try {
                if (op.equals("*")) {
                    return new Times<>(insideExpression);
                } else if (op.equals("/")) {
                    return new Divides<>(insideExpression);
                }
            } catch (IllegalConstruction e) {
                log.warn("Could not create Operation");
                return null;
            }
        }
        log.error("Illegal multiplyingExpression");
        return null;
    }

    @Override
    public Expression<T> visitPowExpression(CalculatorParser.PowExpressionContext ctx) {
        log.trace("Visit pow expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // signedAtom
            return visit(ctx.signedAtom());
        } else if (ctx.children.size() == 3) {
            // signedAtom POW powExpression
            // todo : add pow operation
            log.error("Exponent not yet implemented");
            return null;
        }
        log.error("Illegal powExpression");
        return null;
    }

    @Override
    public Expression<T> visitSignedAtom(CalculatorParser.SignedAtomContext ctx) {
        String text = ctx.getText();
        log.trace("Visit signed atom expression : {}", text);

        if (ctx.func_() == null) {
            if (ctx.atom() != null && ctx.atom().LPAREN() != null) {
                return visit(ctx.atom().expression());
            }
            log.trace("base {}", baseParser.fromString(text));
            return baseParser.fromString(text);
        }
        // todo : add functions
        log.error("function not yet implemented");
        return null;
    }
}
