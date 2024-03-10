package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class TestParser{

    /**
     * This test is used to test the basic functionality of the parser
     */
    @Test
    void testBasicFunctionality(){
        TheParser infix = new TheParser("((4+5+6)*(7+(5/2/7))*9)");
        assertEquals(945, infix.evaluate().getValue());

        TheParser prefix = new TheParser("*(+(4,5,6),+(7,/(5,2,7)),9)");
        assertEquals(945, prefix.evaluate().getValue());

        //TheParser posfix = new TheParser("((4,5,,6)+,(7,(5,2,7)/)+,9)*");
        //assertEquals(945, posfix.evaluate());

    }


}