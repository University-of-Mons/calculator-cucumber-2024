package calculator;

//Import Junit5 libraries for unit testing:

import back.calculator.*;
import back.calculator.operators.Plus;
import back.calculator.operators.Times;
import back.calculator.types.MyNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestPlus {

    private static final int value1 = 8;
    private static final int value2 = 6;
    private Plus op;
    private List<Expression> params;

    @BeforeEach
    void setUp() {
        params = new ArrayList<>(Arrays.asList(new MyNumber(value1), new MyNumber(value2)));
        try {
            op = new Plus(params);
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testConstructor1() {
        // It should not be possible to create a Plus expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Plus(null));
    }

    @SuppressWarnings("AssertBetweenInconvertibleTypes")
    @Test
    void testConstructor2() {
        // A Times expression should not be the same as a Plus expression
        try {
            assertNotSame(op, new Times(new ArrayList<>()));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testEquals() {
        // Two similar expressions, constructed separately (and using different constructors) should be equal
        ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyNumber(value1), new MyNumber(value2)));
        try {
            Plus e = new Plus(p, Notation.INFIX);
            assertEquals(op, e);
            assertEquals(e, e);
            assertNotEquals(e, new Plus(new ArrayList<>(Arrays.asList(new MyNumber(5), new MyNumber(4))), Notation.INFIX));
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
        ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyNumber(value1), new MyNumber(value2)));
        try {
            Plus e = new Plus(p, Notation.INFIX);
            assertEquals(e.hashCode(), op.hashCode());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testNullParamList() {
        params = null;
        assertThrows(IllegalConstruction.class, () -> op = new Plus(params));
    }

}
