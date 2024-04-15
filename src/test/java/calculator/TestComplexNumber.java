package calculator;

import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestComplexNumber {

    private  int real1 , imaginary1, real2,imaginary2;
    ComplexNumber complexNumber1, complexNumber2;
    private Calculator calc;

    @BeforeEach
    void setUp(){
        calc = new Calculator();
        real1 = 3;
        imaginary1 = 4;
        complexNumber1 = new ComplexNumber(real1, imaginary1);
        real2 = 2;
        imaginary2 = 3;
        complexNumber2 = new ComplexNumber(real2, imaginary2);

    }

    @Test
    void testToString() {
        assertEquals(real1 + " + " + imaginary1 + "i", complexNumber1.toString());
    }

    @Test
    void tesAddition() {
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Plus plus = new Plus(para);
            ComplexNumber result = new ComplexNumber(real1 + real2, imaginary1 + imaginary2);
            assertEquals(result.toString(), calc.eval(plus).toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testMinus() {
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Minus minus = new Minus(para);
            ComplexNumber result = new ComplexNumber(real1 - real2, imaginary1 - imaginary2);
            assertEquals(result.toString(), calc.eval(minus).toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testTime(){
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Times times = new Times(para);
            ComplexNumber result = new ComplexNumber(real1 * real2 - imaginary1 * imaginary2, real1 * imaginary2 + real2 * imaginary1);
            assertEquals(result.toString(), calc.eval(times).toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testDivides(){
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Divides divides = new Divides(para);
            ComplexNumber result = new ComplexNumber((real1 * real2 + imaginary1 * imaginary2) / (real2 * real2 + imaginary2 * imaginary2), (real2 * imaginary1 - real1 * imaginary2) / (real2 * real2 + imaginary2 * imaginary2));
            assertEquals(result.toString(), calc.eval(divides).toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

   @Test
    void testSqrtWithNumberNegatif() {
        MyNumber number = new MyNumber(-1);
        List<Expression> para = Arrays.asList(number);
        try {
            Sqrt sqrt = new Sqrt(para);
            assertEquals(1, calc.eval(sqrt).getValue());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testModulus(){
        List<Expression> para = Arrays.asList(complexNumber1);
        try {
            Modulus modulus = new Modulus(para);
            assertEquals((int) Math.sqrt(real1 * real1 + imaginary1 * imaginary1), calc.eval(modulus).getValue());
        } catch (IllegalConstruction e) {
            fail();
        }
    }
}

