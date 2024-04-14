package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestAnd {

    private final MyNumber True = new MyNumber(1);
    private final MyNumber False = new MyNumber(0);
    private final Calculator calc = new Calculator();

    @Test
    void testAnd() {
        try {
            List<Expression> params = Arrays.asList(True, True);
            And and = new And(params);
            assertEquals(calc.eval(and).getValue(), 1); // 1 & 1 = 1

            params = Arrays.asList(True, False);
            and = new And(params);
            assertEquals(calc.eval(and).getValue(), 0); // 1 & 0 = 0

            params = Arrays.asList(False, True);
            and = new And(params);
            assertEquals(calc.eval(and).getValue(), 0); // 0 & 1 = 0

            params = Arrays.asList(False, False);
            and = new And(params);
            assertEquals(calc.eval(and).getValue(), 0); // 0 & 0 = 0

            params = Arrays.asList(True, True, True, False);
            and = new And(params);
            assertEquals(calc.eval(and).getValue(), 0); // 1 & 1 & 1 & 0 = 0
        } catch (IllegalConstruction e) { fail(); }
    }
}
