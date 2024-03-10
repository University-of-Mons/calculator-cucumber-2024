package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class TestParser{

    /**
     * This test is used to test the basic functionality of the parser
     */
    @Test
    void testBasicFonctionality(){
        TheParser p = new TheParser("((4+5+6)*(7+(5/2/7))*9");
        assertEquals(945, p.evaluate());
    }


}