package calculator;

//Import Junit5 libraries for unit testing:

import back.calculator.IllegalConstruction;
import back.calculator.types.MyNumber;
import back.calculator.operators.Times;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestMyNumber {

    private static final int value = 8;
    private MyNumber number;

    @BeforeEach
    void setUp() {
        number = new MyNumber(value);
    }

    @Test
    void testEquals() {
        // Two distinct MyNumber, constructed separately (using a different constructor) but containing the same value should be equal
        assertEquals(new MyNumber(value), number);
        // Two MyNumbers containing a distinct value should not be equal:
        int otherValue = 7;
        assertNotEquals(new MyNumber(otherValue), number);
        assertEquals(number, number); // Identity check (for coverage, as this should always be true)
        assertNotEquals(number, value); // number is of type MyNumber, while value is of type int, so not equal
        try {
            assertNotEquals(new Times(new ArrayList<>()), number);
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testToStringOnlyReal() {
        assertEquals(Integer.toString(value), number.toString());
        assertEquals("0", new MyNumber(0).toString());
    }

    @Test
    void testToStringOnlyImaginary() {
        MyNumber imaginaryNumber = new MyNumber(0, value);
        assertEquals(value + "i", imaginaryNumber.toString());
        MyNumber imaginaryNumber2 = new MyNumber(0, 1);
        assertEquals("i", imaginaryNumber2.toString());
    }

    @Test
    void testToStringRealAndImaginary() {
        MyNumber complexNumber = new MyNumber(value, value);
        assertEquals(value + "+" + value + "i", complexNumber.toString());
    }

    @Test
    void testToStringNegativeImaginary() {
        MyNumber negativeImaginaryNumber = new MyNumber(0, -value);
        assertEquals("-" + value + "i", negativeImaginaryNumber.toString());
    }

    @Test
    void testToStringRealAndNegativeImaginary() {
        MyNumber complexNumber = new MyNumber(value, -value);
        assertEquals(value + "-" + value + "i", complexNumber.toString());
    }

}
