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

        Parser posfix = new Parser("((4,5,6)+,(7,(5,2,7)/)+,9)*",calculator);
        assertEquals(945, posfix.evaluate().getValue());
    }

    /**
     * This test if the parser is not space sensible
     */
    @Test
    void testNotSpaceSensible(){
        Calculator calculator = new Calculator();
        Parser cal1 = new Parser("(4+5)*2",calculator);
        assertEquals(18, cal1.evaluate().getValue());

        Parser cal2 = new Parser(" ( 4 + 5 ) * 2 ",calculator);
        assertEquals(cal1.evaluate().getValue(), cal2.evaluate().getValue());

        Parser cal3 = new Parser("  (   4   +   5   )   *   2   ",calculator);
        assertEquals(cal1.evaluate().getValue(), cal3.evaluate().getValue());
    }


    /**
     * This test We can write the prefix and postfix expression with spaces instead of commas
     */
    @Test
    void testPrefixAndPostfixWithSpace(){
        Calculator calculator = new Calculator();
        Parser prefix = new Parser("+(10 3)",calculator);
        assertEquals(13, prefix.evaluate().getValue());

        Parser posfix = new Parser("(10   3)+",calculator);
        assertEquals(13, posfix.evaluate().getValue());
    }


    /**
     * This test if the  parser's output can be used like parser's input
     */
    @Test
    void testTheOutputInInput(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("(4+5)*2",calculator);
        Parser parser2 = new Parser(parser.evaluate().toString(),calculator);
        assertEquals(18,parser2.evaluate().getValue());
    }

    @Test
    void testSimplifyExpression(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("((4+5+6)(7+5/2/7)*9)",calculator);
        assertEquals(945, parser.evaluate().getValue());
    }
}