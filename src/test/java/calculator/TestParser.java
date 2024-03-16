package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class TestParser{

    // Infix tests

    @Test
    void testNumber(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("5",calculator);
        assertEquals(5,parser.evaluate().getValue());
    }

    @Test
    void testSum(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("5 + 3",calculator);
        assertEquals(8,parser.evaluate().getValue());
    }

    @Test
    void testNestedMul(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(4+5)*2",calculator);
        assertEquals(18,parser.evaluate().getValue());
    }

    // Postfix test

    @Test
    void testSum2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(5, 3)+",calculator);
        assertEquals(8,parser.evaluate().getValue());
    }

    @Test
    void testNestedMul2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("((4,5)+, 2)*",calculator);
        assertEquals(18,parser.evaluate().getValue());
    }


    /**
     * This test is used to test the basic functionality of the parser
     */
    @Test
    void testBasicFunctionality(){
        Calculator calculator = new Calculator();
        Parser infix = new Parser("((4+5+6)*(7+(5/2/7))*9)",calculator);
        assertEquals(945, infix.evaluate().getValue());

        Parser prefix = new Parser("*(+(4,5,6),+(7,/(5,2,7)),9)",calculator);
        assertEquals(945, prefix.evaluate().getValue());

        //TheParser posfix = new TheParser("((4,5,,6)+,(7,(5,2,7)/)+,9)*");
        //assertEquals(945, posfix.evaluate());

    }

}