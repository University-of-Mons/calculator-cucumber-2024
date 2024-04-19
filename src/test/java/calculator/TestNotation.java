package calculator;

import calculator.operand.MyNumber;
import calculator.operation.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class TestNotation {

    /* This is an auxilary method to avoid code duplication.
     */
    void testNotation(String s, Operation<Integer> o, Notation n) {
        assertEquals(s, o.toString(n));
    }

    /* This is an auxilary method to avoid code duplication.
     */
    void testNotations(String symbol, int value1, int value2, Operation<Integer> op) {
        //prefix notation:
        testNotation(symbol + "(" + value1 + ", " + value2 + ")", op, Notation.PREFIX);
        //infix notation:
        testNotation("(" + value1 + " " + symbol + " " + value2 + ")", op, Notation.INFIX);
        //postfix notation:
        testNotation("(" + value1 + ", " + value2 + ")" + symbol, op, Notation.POSTFIX);
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testOutput(String symbol) {
        int value1 = 8;
        int value2 = 6;
        Operation<Integer> op = null;
        //List<Expression> params = new ArrayList<>(Arrays.asList(new MyNumber(value1),new MyNumber(value2)));
        List<Expression<Integer>> params = Arrays.asList(new MyNumber(value1), new MyNumber(value2));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+" -> op = new Plus<>(params);
                case "-" -> op = new Minus<>(params);
                case "*" -> op = new Times<>(params);
                case "/" -> op = new Divides<>(params);
                default -> fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
        testNotations(symbol, value1, value2, op);
    }

    /*
    Test the nesting of expression
     */
    @Test
    void testNestedExpression() {
        List<Expression<Integer>> params = new ArrayList<>();
        Collections.addAll(params, new MyNumber(3), new MyNumber(4), new MyNumber(5));
        List<Expression<Integer>> params2 = new ArrayList<>();
        Collections.addAll(params2, new MyNumber(5), new MyNumber(3));

        List<Expression<Integer>> params4 = new ArrayList<>();
        try {
            Collections.addAll(params4, new Plus<>(params), new Minus<>(params2), new MyNumber(5));
            Operation<Integer> o = new Divides<>(params4);

            assertEquals("((3, 4, 5)+, (5, 3)-, 5)/", o.toString(Notation.POSTFIX));
            assertEquals("/(+(3, 4, 5), -(5, 3), 5)", o.toString(Notation.PREFIX));
            assertEquals("((3 + 4 + 5) / (5 - 3) / 5)", o.toString(Notation.INFIX));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

}
