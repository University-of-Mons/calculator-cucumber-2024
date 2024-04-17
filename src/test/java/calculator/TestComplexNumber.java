package calculator;

import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestComplexNumber {

    private  float real1 , imaginary1, real2,imaginary2;
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
        assertEquals((int)real1 + " + " + (int)imaginary1 + "i", complexNumber1.toString());
    }

    @Test
    void tesAddition() {
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Plus plus = new Plus(para);
            ComplexNumber result = new ComplexNumber(real1 + real2, imaginary1 + imaginary2);
            MyNumber number = calc.eval(plus);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
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
            MyNumber number = calc.eval(minus);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
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
            MyNumber number = calc.eval(times);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
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
            MyNumber number = calc.eval(divides);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testSqrtWithNumberMinus() {
        MyNumber number = new MyNumber(-1);
        List<Expression> para = List.of(number);
        try {
            Sqrt sqrt = new Sqrt(para);
            assertEquals(1, calc.eval(sqrt).getValue());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testModulus(){
        List<Expression> para = Collections.singletonList(complexNumber1);
        try {
            Modulus modulus = new Modulus(para);
            assertEquals((int) Math.sqrt(real1 * real1 + imaginary1 * imaginary1), calc.eval(modulus).getValue());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testDivides2(){
        List<Expression> para = Arrays.asList(new ComplexNumber(5,1), new ComplexNumber(2,1));
        try {
            Divides divides = new Divides(para);
            ComplexNumber result = new ComplexNumber(2,0);
            assertEquals(result.toString(), calc.eval(divides).toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }
}

