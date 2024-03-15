package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.numbers.MyNotANumber;
import org.junit.jupiter.api.*;

class TestMyNotANumber {
    private final MyNotANumber nan = new MyNotANumber();


    @Test
    void testToString() {
        assertEquals("NaN", nan.toString());
    }
}
