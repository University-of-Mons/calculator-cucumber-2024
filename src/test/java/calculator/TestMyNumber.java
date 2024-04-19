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

    private static final int VALUE = 8;
    private MyNumber number;

    @BeforeEach
    void setUp() {
        number = new MyNumber(VALUE);
    }

    @Test
    void testEquals() {
        // Two distinct MyNumber, constructed separately (using a different constructor) but containing the same value should be equal
        assertEquals(new MyNumber(VALUE), number);

        // Two MyNumbers containing a distinct value should not be equal:
        int otherValue = 7;
        assertNotEquals(new MyNumber(otherValue), number);
        assertEquals(number, number); // Identity check (for coverage, as this should always be true)
        assertNotEquals(VALUE, number); // number is of type MyNumber, while value is of type int, so not equal
        try {
            assertNotEquals(new Times(new ArrayList<>()), number);
        } catch (IllegalConstruction e) {
            fail();
        }

        assertNotEquals(new MyNumber(VALUE, VALUE), new MyNumber(VALUE, VALUE -1));
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
        assertEquals(Integer.toString(VALUE), number.toString());
        assertEquals("0", new MyNumber(0).toString());
    }

    @Test
    void testToStringOnlyImaginary() {
        MyNumber imaginaryNumber = new MyNumber(0, VALUE);
        assertEquals(VALUE + "i", imaginaryNumber.toString());
        MyNumber imaginaryNumber2 = new MyNumber(0, 1);
        assertEquals("i", imaginaryNumber2.toString());
    }

    @Test
    void testToStringRealAndImaginary() {
        MyNumber complexNumber = new MyNumber(VALUE, VALUE);
        assertEquals(VALUE + "+" + VALUE + "i", complexNumber.toString());

        MyNumber complexNumber2 = new MyNumber(VALUE, 1);
        assertEquals(VALUE + "+i", complexNumber2.toString());
    }

    @Test
    void testToStringNegativeImaginary() {
        MyNumber negativeImaginaryNumber = new MyNumber(0, -VALUE);
        assertEquals("-" + VALUE + "i", negativeImaginaryNumber.toString());
    }

    @Test
    void testToStringRealAndNegativeImaginary() {
        MyNumber complexNumber = new MyNumber(VALUE, -VALUE);
        assertEquals(VALUE + "-" + VALUE + "i", complexNumber.toString());
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
