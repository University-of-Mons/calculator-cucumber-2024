package calculator.time;

import calculator.Calculator;
import calculator.Counting;
import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import calculator.operators.time.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import visitor.CountingVisitor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestTimeCounting {

    private Expression e;
    private MyTime time1, time2;

    @BeforeEach
    void setUp() {
        time1 = new MyTime(8, 30, 0);
        time2 = new MyTime(6, 15, 0);
        e = null;
    }

    @Test
    void testTimeCounting() {
        e = time1;
        //test whether a time has zero depth (i.e. no nested expressions)
        CountingVisitor cv = new CountingVisitor();
        cv.setMode(Counting.DEPTH);
        e.accept(cv);
        assertEquals( 0, cv.getValue());
        //test whether a number contains zero operations
        cv.setMode(Counting.COUNT_OPS);
        e.accept(cv);
        assertEquals(0, cv.getValue());
        //test whether a number contains 1 number
        cv.setMode(Counting.COUNT_NBS);
        e.accept(cv);
        assertEquals(1, cv.getValue());
    }

    @ParameterizedTest
    @ValueSource(strings = {"+","-"})
    void testTimeOperationCounting(String symbol) {
        List<Expression> params = Arrays.asList(time1,time2);
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	e = new Plus(params);
                case "-"	->	e = new Minus(params);
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
        //test whether a binary operation has depth 1
        CountingVisitor cv = new CountingVisitor();
        cv.setMode(Counting.DEPTH);
        e.accept(cv);
        assertEquals(1, cv.getValue(),"counting depth of an Operation");
        //test whether a binary operation contains 1 operation
        cv.setMode(Counting.COUNT_OPS);
        e.accept(cv);
        assertEquals(1, cv.getValue());
        //test whether a binary operation contains 2 numbers
        cv.setMode(Counting.COUNT_NBS);
        e.accept(cv);
        assertEquals(2, cv.getValue());
    }
}
