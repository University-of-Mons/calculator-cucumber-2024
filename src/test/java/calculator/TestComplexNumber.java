package calculator;

import calculator.numbers.ComplexForm;
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

    private  double real1 , imaginary1, real2,imaginary2;
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

    @Test
    void testCis() throws IllegalConstruction {
        MyNumber number1 = new MyNumber(2);
        MyNumber number2 = new MyNumber( Math.PI/4);
        List<Expression> para = Arrays.asList(number1, number2);
        try {
            Cis cis = new Cis(para);
            ComplexNumber result = new ComplexNumber((number1.getReal() * Math.cos(number2.getReal())),  (number1.getReal() * Math.sin(number2.getReal())));
            result.setForm(ComplexForm.POLAR);
            assertEquals(result.getReal(), calc.eval(cis).getReal());
            assertEquals(result.getImaginary(), calc.eval(cis).getImaginary());
            assertEquals(result.toString(), calc.eval(cis).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testExponential_i() throws IllegalConstruction {
        MyNumber number1 = new MyNumber(2);
        MyNumber number2 = new MyNumber( Math.PI/4);
        List<Expression> para = Arrays.asList(number1, number2);
        try {
            Exponential_i exponential_i = new Exponential_i(para);
            ComplexNumber result = new ComplexNumber( (number1.getReal() * Math.cos(number2.getReal())), (number1.getReal() * Math.sin(number2.getReal())));
            result.setForm(ComplexForm.EXPONENTIAL);
            assertEquals(result.getReal(), calc.eval(exponential_i).getReal());
            assertEquals(result.getImaginary(), calc.eval(exponential_i).getImaginary());
            assertEquals(result.toString(), calc.eval(exponential_i).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringCartesianIntoCartesian() {
        ComplexNumber complexNumber = new ComplexNumber( Math.sqrt(2), Math.sqrt(2));
        List<Expression> para = Collections.singletonList(complexNumber);
        try {
            IntoCartesianFrom intoCartesianFrom = new IntoCartesianFrom(para);
            assertEquals("1 + i", calc.eval(intoCartesianFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }



    @Test
    void testStringCartesianIntoExponential() {
        ComplexNumber complexNumber = new ComplexNumber( Math.sqrt(2),Math.sqrt(2));
        List<Expression> para = Collections.singletonList(complexNumber);
        try {
            IntoExponentialForm intoExponentialForm = new IntoExponentialForm(para);
            assertEquals("2 * e^(i*0)", calc.eval(intoExponentialForm).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }
    @Test
    void testStringCartesianIntoPolar() {
        ComplexNumber complexNumber = new ComplexNumber( Math.sqrt(2), Math.sqrt(2));
        List<Expression> para = Collections.singletonList(complexNumber);
        try {
            IntoPolarForm intoPolarFrom = new IntoPolarForm(para);
            assertEquals("2 * cis(0)", calc.eval(intoPolarFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringPolarIntoPolar() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber( Math.PI/4));
        try {
            Cis polar =new  Cis(para);
            List<Expression> para2 = Collections.singletonList(polar);
            IntoPolarForm intoPolarFrom = new IntoPolarForm(para2);
            assertEquals("2 * cis(0)", calc.eval(intoPolarFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringPolarIntoCartesian() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber(Math.PI/4));
        try {
            Cis polar =new  Cis(para);
            List<Expression> para2 = Collections.singletonList(polar);
            IntoCartesianFrom intoCartesianFrom = new IntoCartesianFrom(para2);
            assertEquals("1 + i", calc.eval(intoCartesianFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringPolarIntoExponential() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber( Math.PI/4));
        try {
            Cis polar =new  Cis(para);
            List<Expression> para2 = Collections.singletonList(polar);
            IntoExponentialForm intoExponentialForm = new IntoExponentialForm(para2);
            assertEquals("2 * e^(i*0)", calc.eval(intoExponentialForm).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }




    @Test
    void testStringExponentialIntoExponential() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber( Math.PI/4));
        try {
            Exponential_i exponential_i = new Exponential_i(para);
            List<Expression> para2 = Collections.singletonList(exponential_i);
            IntoExponentialForm intoExponentialForm = new IntoExponentialForm(para2);
            assertEquals("2 * e^(i*0)", calc.eval(intoExponentialForm).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringExponentialIntoCartesian() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber(Math.PI/4));
        try {
            Exponential_i exponential_i = new Exponential_i(para);
            List<Expression> para2 = Collections.singletonList(exponential_i);
            IntoCartesianFrom intoCartesianFrom = new IntoCartesianFrom(para2);
            assertEquals("1 + i", calc.eval(intoCartesianFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringExponentialIntoPolar() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber( Math.PI/4));
        try {
            Exponential_i exponential_i = new Exponential_i(para);
            List<Expression> para2 = Collections.singletonList(exponential_i);
            IntoPolarForm intoPolarFrom = new IntoPolarForm(para2);
            assertEquals("2 * cis(0)", calc.eval(intoPolarFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

}

