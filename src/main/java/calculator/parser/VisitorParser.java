package calculator.parser;

import calculator.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class VisitorParser extends CalculatorBaseVisitor<Expression> {

    private Expression createOperation(String op, List<Expression> insideExpression){
        try {
            return switch (op) {
                case "*" -> new Times(insideExpression);
                case "/" -> new Divides(insideExpression);
                case "+" -> new Plus(insideExpression);
                case "-" -> new Minus(insideExpression);
                default -> {
                    System.out.println("Could not create Operation");
                    yield null;
                }
            };
        } catch (IllegalConstruction e) {
            System.out.println("Could not create Operation");
            return null;
        }
    }

    @Override
    public Expression visitInit(CalculatorParser.InitContext ctx) {
        return visit(ctx.children.getFirst());
    }

    @Override
    public Expression visitExpression(CalculatorParser.ExpressionContext ctx) {
        if (ctx.children.size() == 1) {
            // multiplyingExpression
            return visit(ctx.multiplyingExpression());
        } else if (ctx.children.size() == 3) {
            // expression (PLUS | MINUS) multiplyingExpression
            List<Expression> insideExpression = new ArrayList<>();
            insideExpression.add(visit(ctx.expression()));
            insideExpression.add(visit(ctx.multiplyingExpression()));

            String op = ctx.children.get(1).getText();
            return createOperation(op,insideExpression);
        }
        return null;
    }

    @Override
    public Expression visitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        if (ctx.children.size() == 1) {
            // powExpression
            return visit(ctx.powExpression());
        } else if (ctx.children.size() == 3) {
            // multiplyingExpression (TIMES | DIV) powExpression
            List<Expression> insideExpression = new ArrayList<>();
            insideExpression.add(visit(ctx.multiplyingExpression()));
            insideExpression.add(visit(ctx.powExpression()));

            String op = ctx.children.get(1).getText();
            return createOperation(op,insideExpression);
        }
        return null;
    }

    @Override
    public Expression visitPowExpression(CalculatorParser.PowExpressionContext ctx) {
        if (ctx.children.size() == 1) {
            // signedAtom
            return visit(ctx.signedAtom());
        } else if (ctx.children.size() == 3) {
            // signedAtom POW powExpression
            // todo : add pow operation
            System.out.println("Exponent not yet implemented");
            return null;
        }
        return null;
    }

    @Override public Expression visitPostfix_expression(CalculatorParser.Postfix_expressionContext ctx) {
        if (ctx.children.size() == 1) {
            // postfix_multiplyingExpression
            return visit(ctx.signedAtom());
        } else {
            // LPAREN (postfix_multiplyingExpression COMMA?)+ RPAREN (PLUS | MINUS)
            List<Expression> insideExpression = new ArrayList<>();
            for (var expr:ctx.postfix_expression()) {
                insideExpression.add(visit(expr));
            }

            String op = ctx.children.getLast().getText();
            return createOperation(op,insideExpression);
        }
    }

    @Override public Expression visitPrefix_expression(CalculatorParser.Prefix_expressionContext ctx) {
        if (ctx.children.size() == 1) {
            // prefix_multiplyingExpression
            return visit(ctx.signedAtom());
        } else {
            // LPAREN (prefix_multiplyingExpression COMMA?)+ RPAREN (PLUS | MINUS)
            List<Expression> insideExpression = new ArrayList<>();
            for (var expr:ctx.prefix_expression()) {
                insideExpression.add(visit(expr));
            }

            String op = ctx.children.getFirst().getText();
            return createOperation(op,insideExpression);
        }
    }


    @Override
    public Expression visitSignedAtom(CalculatorParser.SignedAtomContext ctx) {
        String text = ctx.getText();
        if (ctx.func_() == null) {
            if (ctx.atom() != null && ctx.atom().LPAREN() != null) {
                return visit(ctx.atom().expression());
            }
            return new MyNumber(Integer.parseInt(text));
        }
        return null;
    }

    // Boolean expressions

    /**
     * Visit a parse tree produced by {@link CalculatorParser#batom}.
     * @param ctx the parse tree
     * return super.visitBatom(ctx);
     * batom: LPAREN boolean_expression RPAREN | BOOLEAN;
     * BOOLEAN: 'true' | 'false';
     * @return
     */
    @Override
    public Expression visitBatom(CalculatorParser.BatomContext ctx) {
        if (ctx.boolean_expression() != null) {
            return visit(ctx.boolean_expression());
        }
        return new MyNumber(ctx.BOOLEAN().getText().equals("true") ? 1 : 0);
    }

    @Override
    public Expression visitNotExpression(CalculatorParser.NotExpressionContext ctx) {
        if (ctx.children.size() == 1) {
            return visit(ctx.batom());
        }
        return new Not(visit(ctx.batom()));
    }

    @Override
    public Expression visitAndExpression(CalculatorParser.AndExpressionContext ctx) {
        if (ctx.children.size() == 1) {
            return super.visitAndExpression(ctx);
        }
        return visitOperation(And.class, ctx.notExpression());
    }

    @Override
    public Expression visitXorExpression(CalculatorParser.XorExpressionContext ctx) {
        if (ctx.children.size() == 1) return super.visitXorExpression(ctx);
        return visitOperation(Xor.class, ctx.andExpression());
    }

    @Override
    public Expression visitOrExpression(CalculatorParser.OrExpressionContext ctx) {
        if (ctx.children.size() == 1) return super.visitOrExpression(ctx);
        return visitOperation(Or.class, ctx.xorExpression());
    }

    @Override
    public Expression visitImplication(CalculatorParser.ImplicationContext ctx) {
        if (ctx.children.size() == 1) return super.visitImplication(ctx);
        return visitOperation(Implication.class, ctx.orExpression());
    }

    @Override
    public Expression visitBoolean_expression(CalculatorParser.Boolean_expressionContext ctx) {
        return super.visitBoolean_expression(ctx);
    }

    private <T extends Operation, C extends List<? extends ParserRuleContext>> Expression visitOperation(Class<T> Operand, C ctx) {
        try {
            List<Expression> params = new ArrayList<>();
            for (var exp:ctx) {
                params.add(visit(exp));
            }
            return Operand.getConstructor(List.class).newInstance(params);
        } catch (Exception e) {
            throw new RuntimeException("Could not create operation");
        }
    }
}
