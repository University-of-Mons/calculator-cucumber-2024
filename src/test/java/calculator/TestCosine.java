package calculator;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.operators.Cosine;
import back.calculator.types.MyNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestCosine {

    private static final int real = 3;
    private static final int imaginary = 4;
    private Cosine op;

    @BeforeEach
    void setUp() {
        List<Expression> params = List.of(new MyNumber(real, imaginary));
        try {
            op = new Cosine(params);
        } catch (IllegalConstruction e) {
            fail("Error during Cosine creation");
        }
    }

    @Test
    void testConstructor1ShouldThrowWhenEmptyParameters() {
        // It should not be possible to create a Plus expression with null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Cosine(null));
    }

    @Test
    void testConstructor2ShouldThrowWhenMoreThanOneParameter() {
        // It should not be possible to create a Plus expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Cosine(List.of(new MyNumber(1), new MyNumber(2))));
    }

    @Test
    void testEquals() {
        // Two similar expressions, constructed separately (and using different constructors) should be equal
        ArrayList<Expression> p = new ArrayList<>(List.of(new MyNumber(real, imaginary)));
        try {
            Cosine e = new Cosine(p, Notation.INFIX);
            assertEquals(op, e);
            assertEquals(e, e);
            assertNotEquals(e, new Cosine(new ArrayList<>(List.of(new MyNumber(imaginary, real))), Notation.INFIX));
        } catch (IllegalConstruction e) {
            fail("Error during Cosine creation in test");
        }
    }

    @Test
    void testOpWith2ParametersShouldThrow() {
        // It should not be possible to call op with 2 parameters
        assertThrows(UnsupportedOperationException.class, () -> op.op(new MyNumber(1), new MyNumber(2)));
    }

    @Test
    void testAddMoreParamsResultingInMoreThanOneParameter() {
        // It should not be possible to add more parameters to a Cosine expression
        assertThrows(IllegalConstruction.class, () -> op.addMoreParams(List.of(new MyNumber(1))));
    }
}
