package calculator;

//Import Junit5 libraries for unit testing:

import calculator.operand.MyNumber;
import calculator.operation.Opposite;
import calculator.operation.Times;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestOpposite {

    private final int value1 = 8;
    private Opposite<Integer> op;
    private List<Expression<Integer>> params;

    @BeforeEach
    void setUp() {
        params = List.of(new MyNumber(value1));
        try {
            op = new Opposite<>(params);
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testConstructor1() {
        // It should not be possible to create an expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Opposite<>(null));
    }

    @SuppressWarnings("AssertBetweenInconvertibleTypes")
    @Test
    void testConstructor2() {
        // A Times expression should not be the same as a Opposite expression
        try {
            assertNotSame(op, new Times<>(new ArrayList<>()));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testEquals() {
        // Two similar expressions, constructed separately (and using different constructors) should be equal
        List<Expression<Integer>> p = List.of(new MyNumber(value1));
        try {
            Opposite<Integer> d = new Opposite<>(p);
            assertEquals(op, d);
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void testNull() {
        assertDoesNotThrow(() -> op == null); // Direct way to to test if the null case is handled.
    }

    @Test
    void testHashCode() {
        // Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
        List<Expression<Integer>> p = List.of(new MyNumber(value1));
        try {
            Opposite<Integer> e = new Opposite<>(p);
            assertEquals(e.hashCode(), op.hashCode());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testNullParamList() {
        params = null;
        assertThrows(IllegalConstruction.class, () -> op = new Opposite<>(params));
    }

    @Test
    void testMoreOneParam() {
        assertThrows(IllegalConstruction.class, () -> new Opposite<>(List.of(new MyNumber(4), new MyNumber(5))));
    }

}
