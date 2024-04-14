package calculator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class TestXor {

    private final MyNumber True = new MyNumber(1);
    private final MyNumber False = new MyNumber(0);
    private final Calculator calc = new Calculator();

    @Test
    void testXor() {
        try {
            List<Expression> params = List.of(True, True);
            Xor xor = new Xor(params);
            assert calc.eval(xor).getValue() == 0; // 1 ^ 1 = 0

            params = List.of(True, False);
            xor = new Xor(params);
            assert calc.eval(xor).getValue() == 1; // 1 ^ 0 = 1

            params = List.of(False, True);
            xor = new Xor(params);
            assert calc.eval(xor).getValue() == 1; // 0 ^ 1 = 1

            params = List.of(False, False);
            xor = new Xor(params);
            assert calc.eval(xor).getValue() == 0; // 0 ^ 0 = 0

            params = List.of(False, False, False, True);
            xor = new Xor(params);
            assert calc.eval(xor).getValue() == 1; // 0 ^ 0 ^ 0 ^ 1 = 1
        } catch (IllegalConstruction e) {
            fail();
        }
    }
}
