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

    private Expression<T> createOperation(String op, List<Expression<T>> insideExpression){
        try {
            return switch (op) {
                case "*" -> new Times<>(insideExpression);
                case "/" -> new Divides<>(insideExpression);
                case "+" -> new Plus<>(insideExpression);
                case "-" -> new Minus<>(insideExpression);
                default -> {
                    log.warn("Could not create Operation");
                    yield null;
                }
            };
        } catch (IllegalConstruction e) {
            log.warn("Could not create Operation");
            return null;
        }
    }

    @Override
    public Expression<T> visitInit(CalculatorParser.InitContext ctx) {
        return visit(ctx.children.getFirst());
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
            return createOperation(op,insideExpression);
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
            return createOperation(op,insideExpression);
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

    @Override public Expression<T> visitPostfix_expression(CalculatorParser.Postfix_expressionContext ctx) {
        log.trace("Visit postfix multiplying expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // postfix_multiplyingExpression
            return visit(ctx.postfix_multiplyingExpression(0));
        } else if (ctx.children.size() == 3) {
            // LPAREN (postfix_multiplyingExpression COMMA?)+ RPAREN (PLUS | MINUS)
            List<Expression<T>> insideExpression = new ArrayList<>();
            for (var expr:ctx.postfix_multiplyingExpression()) {
                insideExpression.add(visit(expr));
            }

            String op = ctx.children.getLast().getText();
            return createOperation(op,insideExpression);
        }
        log.error("Illegal multiplyingExpression");
        return null;
    }

    @Override public Expression<T> visitPostfix_multiplyingExpression(CalculatorParser.Postfix_multiplyingExpressionContext ctx) {
        log.trace("Visit postfix multiplying expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // postfix_powExpression
            return visit(ctx.postfix_powExpression(0));
        } else if (ctx.children.size() == 3) {
            // LPAREN (postfix_powExpression COMMA?)+ RPAREN (TIMES | DIV)
            List<Expression<T>> insideExpression = new ArrayList<>();
            for (var expr:ctx.postfix_powExpression()) {
                insideExpression.add(visit(expr));
            }

            String op = ctx.children.getLast().getText();
            return createOperation(op,insideExpression);

        }
        log.error("Illegal multiplyingExpression");
        return null;
    }


    @Override public Expression<T> visitPostfix_powExpression(CalculatorParser.Postfix_powExpressionContext ctx) {
        log.trace("Visit postfix pow expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // signedAtom
            return visit(ctx.signedAtom(0));
        } else if (ctx.children.size() == 3) {
            // signedAtom POW powExpression
            // todo : add pow operation
            log.error("Exponent not yet implemented");
            return null;
        }
        log.error("Illegal powExpression");
        return null;
    }

    @Override public Expression<T> visitPrefix_expression(CalculatorParser.Prefix_expressionContext ctx) {
        log.trace("Visit prefix multiplying expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // prefix_multiplyingExpression
            return visit(ctx.prefix_multiplyingExpression(0));
        } else if (ctx.children.size() == 3) {
            // LPAREN (prefix_multiplyingExpression COMMA?)+ RPAREN (PLUS | MINUS)
            List<Expression<T>> insideExpression = new ArrayList<>();
            for (var expr:ctx.prefix_multiplyingExpression()) {
                insideExpression.add(visit(expr));
            }

            String op = ctx.children.getFirst().getText();
            return createOperation(op,insideExpression);
        }
        log.error("Illegal multiplyingExpression");
        return null;
    }

    @Override public Expression<T> visitPrefix_multiplyingExpression(CalculatorParser.Prefix_multiplyingExpressionContext ctx) {
        log.trace("Visit prefix multiplying expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // prefix_powExpression
            return visit(ctx.prefix_powExpression(0));
        } else if (ctx.children.size() == 3) {
            // LPAREN (prefix_powExpression COMMA?)+ RPAREN (TIMES | DIV)
            List<Expression<T>> insideExpression = new ArrayList<>();
            for (var expr:ctx.prefix_powExpression()) {
                insideExpression.add(visit(expr));
            }

            String op = ctx.children.getFirst().getText();
            return createOperation(op,insideExpression);

        }
        log.error("Illegal multiplyingExpression");
        return null;
    }


    @Override public Expression<T> visitPrefix_powExpression(CalculatorParser.Prefix_powExpressionContext ctx) {
        log.trace("Visit prefix pow expression : {}", ctx.getText());

        if (ctx.children.size() == 1) {
            // signedAtom
            return visit(ctx.signedAtom(0));
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
