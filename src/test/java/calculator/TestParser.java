package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParser {

    /**
     * The read expression calls the parser utilities to construct the Expression instance.
     * We can then test the parser by checking the result of the read method.
     */
    @Test
    public void testParser() {
        Calculator c = new Calculator();

        Expression e = c.read("true & false & true");
        assertEquals(0, c.eval(e).getValue());

        e = c.read("true | false | true");
        assertEquals(1, c.eval(e).getValue());

        e = c.read("true & false | true");
        assertEquals(1, c.eval(e).getValue());

        e = c.read("true | false & true");
        assertEquals(1, c.eval(e).getValue());

        e = c.read("true | false => false");
        assertEquals(0, c.eval(e).getValue());

        e = c.read("true ^ true ^ true");
        assertEquals(1, c.eval(e).getValue());
    }
}
