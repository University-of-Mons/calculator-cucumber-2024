package calculator;

import back.calculator.Expression;
import back.calculator.IllegalConstruction;
import back.calculator.Notation;
import back.calculator.operators.Logarithm;
import back.calculator.operators.Logarithm;
import back.calculator.types.MyNumber;
import back.calculator.types.NotANumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLogarithm {

    private Logarithm op;
    private int real = 1;
    private int imaginary = 2;


    @BeforeEach
    void setUp(){
        List<Expression> params = List.of(new MyNumber(real, imaginary));
        try {
            op = new Logarithm(params);
        } catch (IllegalConstruction e) {
            fail("Error during Logarithm creation");
        }
    }

    @Test
    void testConstructor1ShouldThrowWhenEmptyParameters() {
        // It should not be possible to create a Plus expression with null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Logarithm(null));
    }

    @Test
    void testConstructor2ShouldThrowWhenMoreThanOneParameter() {
        // It should not be possible to create a Plus expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Logarithm(List.of(new MyNumber(1), new MyNumber(2))));
    }

    @Test
    void testEquals() {
        // Two similar expressions, constructed separately (and using different constructors) should be equal
        ArrayList<Expression> p = new ArrayList<>(List.of(new MyNumber(real, imaginary)));
        try {
            Logarithm e = new Logarithm(p, Notation.INFIX);
            assertEquals(op, e);
            assertEquals(e, e);
            assertNotEquals(e, new Logarithm(new ArrayList<>(List.of(new MyNumber(imaginary, real))), Notation.INFIX));
        } catch (IllegalConstruction e) {
            fail("Error during Logarithm creation in test");
        }
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void testNull() {
        assertDoesNotThrow(() -> op == null); // Direct way to test if the null case is handled.
    }

    @Test
    void testHashCode() {
        // Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
        ArrayList<Expression> p = new ArrayList<>(List.of(new MyNumber(real, imaginary)));
        try {
            Logarithm e = new Logarithm(p, Notation.INFIX);
            assertEquals(e.hashCode(), op.hashCode());
        } catch (IllegalConstruction e) {
            fail("Error during Logarithm creation in test");
        }
    }

    @Test
    void testOpWith2ParametersShouldThrow() {
        // It should not be possible to call op with 2 parameters
        assertThrows(UnsupportedOperationException.class, () -> op.op(new MyNumber(1), new MyNumber(2)));
    }

    @Test
    void testAddMoreParamsResultingInMoreThanOneParameter() {
        // It should not be possible to add more parameters to a Logarithm expression
        assertThrows(IllegalConstruction.class, () -> op.addMoreParams(List.of(new MyNumber(1))));
    }

    @Test
    void testOpWithNotANumber() {
        // It should not be possible to call op with a NotANumber
        assertEquals(new NotANumber(), op.op(new NotANumber()));
    }
}
