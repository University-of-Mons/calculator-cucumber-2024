package calculator;

import io.cucumber.java.ja.但し;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

class TestComplexNumberParser {

    @Test
    void testComplexNumber(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("5+i",calculator);
        assertEquals(5.0,parser.evaluate().getReal());
        assertEquals(1.0,parser.evaluate().getImaginary());
        assertEquals("5 + i", parser.evaluate().toString());
    }

    @Test
    void testComplexNumberMinus(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("5-3i",calculator);
        assertEquals(5.0,parser.evaluate().getReal());
        assertEquals(-3.0,parser.evaluate().getImaginary());
        assertEquals("5 - 3i", parser.evaluate().toString());
    }
    @Test
    void testComplexNumberNoReal(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("i",calculator);
        assertEquals(0.0,parser.evaluate().getReal());
        assertEquals(1.0,parser.evaluate().getImaginary());
        assertEquals("i", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "-5+3i + -2-i , -7 + 2i",
            "-5+i - -2-2i , -3 + 3i",
            "(5+3i) * i , -3 + 5i",
            "(5+3i) / (2+2i), 2",
    })
    void testComplexNumberOperator(String par, String result){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        System.out.println("ok");
        assertEquals(result, parser.evaluate().toString());
    }

    @Test void testSqrt(){
            Calculator calculator = new Calculator();
            ComplexNumberParser parser = new ComplexNumberParser("sqrt(-1+11)",calculator);
            assertEquals(3,parser.evaluate().getValue());
        }

    @Test
    void testComplexNumberModulus(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("|4+3i|",calculator);
        assertEquals(5, parser.evaluate().getValue());
    }

    @Test
    void testComplexNumberParentheses(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("(-i)",calculator);
        assertEquals("-i", parser.evaluate().toString());
    }

    @Test
    void testComplexNumberIntoPolar(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("intoPolar(sqrt(2)+sqrt(2)i)",calculator);
        assertEquals("2 * cis(45)", parser.evaluate().toString());
    }

    @Test
    void testComplexNumberIntoCartesian(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("intoCartesian(2 * cis(45))",calculator);
        assertEquals("1 + i", parser.evaluate().toString());
    }

    @Test
    void testComplexNumberIntoExponential(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("intoE(intoPolar(2*e(i*45)))",calculator);
        assertEquals("2 * e^(i*45)", parser.evaluate().toString());
    }



    @ParameterizedTest
    @CsvSource({
            "|intoE(sqrt(4))|",
    })
    void testInvalidComplexNumber(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals("NaN", parser.evaluate().toString());
    }
}
