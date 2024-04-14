package calculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestNot {

    private final MyNumber True = new MyNumber(1);
    private final MyNumber False = new MyNumber(0);
    private final Calculator calc = new Calculator();

    @Test
    void testNot() throws IllegalConstruction {
        Not not = new Not(True);
        assertEquals(calc.eval(not).getValue(), 0); // !1 = 0

        not = new Not(False);
        assertEquals(calc.eval(not).getValue(), 1); // !0 = 1
    }
}
