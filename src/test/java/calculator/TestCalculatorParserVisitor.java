package calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCalculatorParserVisitor {

    private Calculator calc;

    private int value1, value2, value3;

    private final String[] operators = {"*", "+", "/", "-"};

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        value1 = 8;
        value2 = 6;
        value3 = 5;
    }

    @Test
    void testParseInfix() {
        for (String operator : operators) {
            String expression = "( " + value1 + " " + operator + " ( " + value2 + " " + operator + " " + value3 + " ) )";
            Expression e = calc.read(expression);
            assertEquals(expression, calc.format(e, Notation.INFIX));
        }
    }

    @Test
    void testParsePrefix() {
        for (String operator : operators) {
            String expression = operator + " (" + value1 + ", " + operator + " (" + value2 + ", " + value3 + "))";
            Expression e = calc.read(expression);
            assertEquals(expression, calc.format(e, Notation.PREFIX));
        }
    }

    @Test
    void testParsePostfix() {
        for (String operator : operators) {
            String expression = "(" + value1 + ", (" + value2 + ", " + value3 + ") " + operator + ") " + operator;
            Expression e = calc.read(expression);
            assertEquals(expression, calc.format(e, Notation.POSTFIX));
        }
    }



}
