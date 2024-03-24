package calculator;

import calculator.operand.MyNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestParser {
    private Parser<Integer> parser;
    private Calculator<Integer> calculator;

    @BeforeEach
    void setUp() {
        parser = new Parser<>();
        calculator = new Calculator<>();
    }

    @Test
    void testNaN() {
        try {
            Expression<Integer> expression = parser.parse("5*4 + 3 * 3 - 458 * 740 /0 * 90 +4 -870 / 8", Parser::stringToInteger);
            assertEquals(new MyNaN<Integer>(), calculator.eval(expression));
        } catch (IllegalExpression e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testIllegalExpression() {
        assertThrows(IllegalExpression.class, () -> parser.parse("abrav12(85) + 78", Parser::stringToInteger));
        assertThrows(IllegalExpression.class, () -> parser.parse(" + ", Parser::stringToInteger));
        assertThrows(IllegalExpression.class, () -> parser.parse("  + 654 * 45 ", Parser::stringToInteger));
        assertThrows(IllegalExpression.class, () -> parser.parse(" 50 -6 *540 + ", Parser::stringToInteger));
    }

    @Test
    void testCorrectExpressions() {
        try {
            Expression<Integer> expression = parser.parse("5*4 + 3 * 3", Parser::stringToInteger);
            assertEquals(new MyNumber(29), calculator.eval(expression));
            expression = parser.parse("9856 + 6450 - 981 /89 +654", Parser::stringToInteger);

            System.out.println( 9856 + 6450 - 981 /89 +654);
            System.out.println(expression.toString());
//            assertEquals(new MyNumber(16949), calculator.eval(expression));
        } catch (IllegalExpression e) {
            throw new RuntimeException(e);
        }
    }

}
