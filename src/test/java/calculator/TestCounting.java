package calculator;

//Import Junit5 libraries for unit testing:

import calculator.operand.MyNumber;
import calculator.operation.Divides;
import calculator.operation.Minus;
import calculator.operation.Plus;
import calculator.operation.Times;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import visitor.CountDepth;
import visitor.CountNbs;
import visitor.CountOps;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class TestCounting {

    private int value1, value2;
    private Expression<Integer> e;

    @BeforeEach
    void setUp() {
        value1 = 8;
        value2 = 6;
        e = null;
    }

    @Test
    void testNumberCounting() {
        e = new MyNumber(value1);
        CountDepth<Integer> cd = new CountDepth<>();
        e.accept(cd);
        //test whether a number has zero depth (i.e. no nested expressions)
        assertEquals(0, cd.getDepth());
        CountOps<Integer> co = new CountOps<>();
        e.accept(co);
        //test whether a number contains zero operations
        assertEquals(0, co.getOps());
        CountNbs<Integer> cn = new CountNbs<>();
        e.accept(cn);
        //test whether a number contains 1 number
        assertEquals(1, cn.getNbs());
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testOperationCounting(String symbol) {
        List<Expression<Integer>> params = Arrays.asList(new MyNumber(value1), new MyNumber(value2));
        //Operation op = null;
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+" -> e = new Plus<>(params);
                case "-" -> e = new Minus<>(params);
                case "*" -> e = new Times<>(params);
                case "/" -> e = new Divides<>(params);
                default -> fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
        //test whether a binary operation has depth 1
        CountDepth<Integer> cd = new CountDepth<>();
        e.accept(cd);
        assertEquals(1, cd.getDepth(), "counting depth of an Operation");
        //test whether a binary operation contains 1 operation
        CountOps<Integer> co = new CountOps<>();
        e.accept(co);
        assertEquals(1, co.getOps());
        //test whether a binary operation contains 2 numbers
        CountNbs<Integer> cn = new CountNbs<>();
        e.accept(cn);
        assertEquals(2, cn.getNbs());
    }

}
