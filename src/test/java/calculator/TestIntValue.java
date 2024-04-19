package calculator;

import back.calculator.App;
import back.calculator.types.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestIntValue {

    @Test
    void testConstructor() {
        IntValue i = new IntValue(1);
        assertEquals(1, i.getValue());
        assertEquals(Type.INT, i.getType());
    }

    @Test
    void testEquals() {
        IntValue i = new IntValue(1);
        IntValue i2 = new IntValue(1);
        IntValue i3 = new IntValue(2);
        assertEquals(i, i2);
        assertEquals(i, i);
        assertNotEquals(i, i3);

        assertNotEquals(i, new MyNumber(i));

        RationalValue r = new RationalValue(new IntValue(1), new IntValue(1));
        assertEquals(i, r);

        RealValue re = new RealValue(new BigDecimal("1", App.getPrecision()));
        assertEquals(i, re);
    }

    @Test
    void testAtan() {
        IntValue i = new IntValue(1);
        assertEquals(new RealValue(new BigDecimal(Double.toString(Math.PI/4), App.getPrecision())), i.atan());
    }

    @Test
    void testExp() {
        IntValue i = new IntValue(1);
        assertEquals(new RealValue(new BigDecimal(Double.toString(Math.exp(1)), App.getPrecision())), i.exp());
    }

    @Test
    void testLn() {
        IntValue i = new IntValue(1);
        assertEquals(new RealValue(new BigDecimal(Double.toString(Math.log(1)), App.getPrecision())), i.ln());
    }

    @Test
    void testCos() {
        IntValue i = new IntValue(1);
        assertEquals(new RealValue(new BigDecimal(Double.toString(Math.cos(1)), App.getPrecision())), i.cos());
    }

    @Test
    void testSin() {
        IntValue i = new IntValue(1);
        assertEquals(new RealValue(new BigDecimal(Double.toString(Math.sin(1)), App.getPrecision())), i.sin());
    }

    @Test
    void testSqrt() {
        IntValue i = new IntValue(1);
        assertEquals(new RealValue(new BigDecimal(Double.toString(Math.sqrt(1)), App.getPrecision())), i.sqrt());
    }

}