package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

class TestComplexNumberParser {

    @Test
    void testComplexNumber(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("5+3i",calculator);
        assertEquals(5.0,parser.evaluate().getReal());
        assertEquals(3.0,parser.evaluate().getImaginary());
        assertEquals("5 + 3i", parser.evaluate().toString());
    }

    @Test
    void testComplexNumberMinus(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("5-3i",calculator);
        assertEquals(5.0,parser.evaluate().getReal());
        assertEquals(-3.0,parser.evaluate().getImaginary());
        assertEquals("5 - 3i", parser.evaluate().toString());
    }
    @Test
    void testComplexNumberNoReal(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("i",calculator);
        assertEquals(0.0,parser.evaluate().getReal());
        assertEquals(1.0,parser.evaluate().getImaginary());
        assertEquals("i", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "5+3i + 2+2i", "7 + 5i",
            "5+3i - 2+2i","3 + i",
            "(5+3i) * (2+2i)","4 + 16i",
            "(5+3i) / (2+2i)","2",
    })
    void testComplexNumberOperator(String par, String result){
        Calculator calculator = new Calculator();
        Parser parser = new Parser(par,calculator);
        assertEquals(result, parser.evaluate().toString());
    }

    @Test void testSqrt(){
            Calculator calculator = new Calculator();
            Parser parser = new Parser("sqrt(9)",calculator);
            assertEquals(3,parser.evaluate().getValue());
        }

    @Test
    void testComplexNumberModulus(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("|4+3i|",calculator);
        assertEquals(5, parser.evaluate().getValue());
    }

    @Test
    void testComplexNumberParentheses(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("(5+3i)",calculator);
        assertEquals("5 + 3i", parser.evaluate().toString());
    }
}
