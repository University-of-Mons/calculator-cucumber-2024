package calculator;

//Import Junit5 libraries for unit testing:

import back.calculator.ComplexForm;
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

        assertNotEquals(new MyNumber(value, value), new MyNumber(value, value-1));
    }

    @Test
    void testGetForm() {
        ComplexForm form = ComplexForm.CARTESIAN;

        assertEquals(form, number.getForm());

        number.setForm(ComplexForm.POLAR);
        assertEquals(ComplexForm.POLAR, number.getForm());

        number.setForm(ComplexForm.EXPONENTIAL);
        assertEquals(ComplexForm.EXPONENTIAL, number.getForm());
        number.setForm(ComplexForm.CARTESIAN);
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

        MyNumber complexNumber2 = new MyNumber(value, 1);
        assertEquals(value + "+i", complexNumber2.toString());
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

    @Test
    void testToStringPolarWithReal() {
        MyNumber polarNumber = new MyNumber(1);
        polarNumber.setForm(ComplexForm.POLAR);
        assertEquals("1(cos(0)+isin(0))", polarNumber.toString());

        MyNumber polarNumber2 = new MyNumber(-1);
        polarNumber2.setForm(ComplexForm.POLAR);
        assertEquals("-1(cos(pi)+isin(pi))", polarNumber2.toString());
    }

    @Test
    void testToStringExpWithReal() {
        MyNumber polarNumber = new MyNumber(1);
        polarNumber.setForm(ComplexForm.EXPONENTIAL);
        assertEquals("1exp(0)", polarNumber.toString());

        MyNumber polarNumber2 = new MyNumber(-1);
        polarNumber2.setForm(ComplexForm.EXPONENTIAL);
        assertEquals("-1exp(pii)", polarNumber2.toString());
    }

}
