package calculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestOr {

    private final MyNumber True = new MyNumber(1);
    private final MyNumber False = new MyNumber(0);
    private final Calculator calc = new Calculator();

    @Test
    void testOr() {
        try {
            List<Expression> params = Arrays.asList(True, True);
            Or or = new Or(params);
            assertEquals(calc.eval(or).getValue(), 1); // 1 | 1 = 1

            params = Arrays.asList(True, False);
            or = new Or(params);
            assertEquals(calc.eval(or).getValue(), 1); // 1 | 0 = 1

            params = Arrays.asList(False, True);
            or = new Or(params);
            assertEquals(calc.eval(or).getValue(), 1); // 0 | 1 = 1

            params = Arrays.asList(False, False);
            or = new Or(params);
            assertEquals(calc.eval(or).getValue(), 0); // 0 | 0 = 0

            params = Arrays.asList(False, False, False, True);
            or = new Or(params);
            assertEquals(calc.eval(or).getValue(), 1); // 0 | 0 | 0 | 1 = 1
        } catch (IllegalConstruction e) { fail(); }
    }
}
