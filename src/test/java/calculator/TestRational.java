package calculator;

import back.calculator.types.IntValue;
import back.calculator.types.RationalValue;
import back.calculator.types.RealValue;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.jupiter.api.Assertions.*;

public class TestRational {

    @Test
    void testConstructor() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        assertEquals(1, r.getNum());
        assertEquals(2, r.getDen());

        RationalValue r2 = new RationalValue(r, new IntValue(3));
        assertEquals(1, r2.getNum());
        assertEquals(6, r2.getDen());

        RationalValue r3 = new RationalValue(new IntValue(3), r);
        assertEquals(6, r3.getNum());
        assertEquals(1, r3.getDen());

        RationalValue r4 = new RationalValue(r, r2);
        assertEquals(3, r4.getNum());
        assertEquals(1, r4.getDen());
    }

    @Test
    void testReduce() {
        RationalValue r = new RationalValue(new IntValue(2), new IntValue(4));
        assertEquals(1, r.getNum());
        assertEquals(2, r.getDen());

        RationalValue r2 = new RationalValue(new IntValue(6), new IntValue(3));
        assertEquals(2, r2.getNum());
        assertEquals(1, r2.getDen());

        RationalValue r4 = new RationalValue(new IntValue(-4), new IntValue(8));
        assertEquals(-1, r4.getNum());
        assertEquals(2, r4.getDen());

        RationalValue r5 = new RationalValue(new IntValue(4), new IntValue(-8));
        assertEquals(-1, r5.getNum());
        assertEquals(2, r5.getDen());
    }


    @Test
    void testAdd() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        IntValue i = new IntValue(1);
        RationalValue r2 = (RationalValue) r.add(i);
        assertEquals(3, r2.getNum());
        assertEquals(2, r2.getDen());

        RationalValue r3 = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r4 = new RationalValue(new IntValue(1), new IntValue(3));
        RationalValue r5 = (RationalValue) r3.add(r4);
        assertEquals(5, r5.getNum());
        assertEquals(6, r5.getDen());

        RationalValue r6 = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r7 = new RationalValue(new IntValue(1), new IntValue(2));
        IntValue i2 = (IntValue) r6.add(r7);
        assertEquals(1, i2.getValue());

        RationalValue r8 = new RationalValue(new IntValue(1), new IntValue(2));
        RealValue real = new RealValue(new BigDecimal(0.5,new MathContext(5)));
        RealValue r9 = (RealValue) r8.add(real);
        assertEquals(new RealValue(new BigDecimal(1.0,new MathContext(5))), r9);
    }

    @Test
    void testSub() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r2 = new RationalValue(new IntValue(1), new IntValue(3));
        RationalValue r3 = (RationalValue) r.sub(r2);
        assertEquals(1, r3.getNum());
        assertEquals(6, r3.getDen());

        RationalValue r4 = new RationalValue(new IntValue(1), new IntValue(2));
        IntValue i = new IntValue(1);
        RationalValue r5 = (RationalValue) r4.sub(i);
        assertEquals(-1, r5.getNum());
        assertEquals(2, r5.getDen());

        RationalValue r6 = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r7 = new RationalValue(new IntValue(1), new IntValue(2));
        IntValue i2 = (IntValue) r6.sub(r7);
        assertEquals(0, i2.getValue());


        RationalValue r8 = new RationalValue(new IntValue(1), new IntValue(2));
        RealValue real = new RealValue(new BigDecimal(0.5,new MathContext(5)));
        RealValue r9 = (RealValue) r8.sub(real);
        assertEquals(new RealValue(new BigDecimal(0.0,new MathContext(5))), r9);
    }

    @Test
    void testMul() {
        RationalValue r1 = new RationalValue(new IntValue(2), new IntValue(3));
        assertTrue(r1.equals(r1));

        RationalValue r2 = new RationalValue(new IntValue(2), new IntValue(3));
        assertFalse(r2.equals(new Object()));

        RationalValue r3 = new RationalValue(new IntValue(2), new IntValue(3));
        RationalValue r4 = new RationalValue(new IntValue(2), new IntValue(3));
        assertTrue(r3.equals(r4));

        RationalValue r5 = new RationalValue(new IntValue(2), new IntValue(3));
        RationalValue r6 = new RationalValue(new IntValue(3), new IntValue(2));
        assertFalse(r5.equals(r6));

        RationalValue r7 = new RationalValue(new IntValue(2), new IntValue(1));
        IntValue i1 = new IntValue(2);
        assertTrue(r7.equals(i1));

        RationalValue r8 = new RationalValue(new IntValue(2), new IntValue(1));
        IntValue i2 = new IntValue(3);
        assertFalse(r8.equals(i2));
    }

    @Test
    void testDiv() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r2 = new RationalValue(new IntValue(1), new IntValue(3));
        RationalValue r3 = (RationalValue) r.div(r2);
        assertEquals(3, r3.getNum());
        assertEquals(2, r3.getDen());


        RationalValue r4 = new RationalValue(new IntValue(1), new IntValue(2));
        RealValue real = new RealValue(new BigDecimal(0.5,new MathContext(5)));
        RealValue r5 = (RealValue) r4.div(real);
        assertEquals(new RealValue(new BigDecimal(1.0,new MathContext(5))), r5);
    }

    @Test
    void testRealOperations(){
        RationalValue rational = new RationalValue(new IntValue(1), new IntValue(2));
        RealValue real = new RealValue(new BigDecimal(0.5,new MathContext(5)));

        assertEquals(real.sqrt(), rational.sqrt());
        assertEquals(real.cos(), rational.cos());
        assertEquals(real.sin(), rational.sin());
        // TODO : Uncomment when implemented
//        assertEquals(real.ln(), rational.ln());
        assertEquals(real.exp(), rational.exp());
        assertEquals(real.atan(), rational.atan());
    }

    @Test
    void testEquals() {
        RationalValue r = new RationalValue(new IntValue(2), new IntValue(3));
        assertTrue(r.equals(r));

        RationalValue r2 = new RationalValue(new IntValue(2), new IntValue(3));
        assertFalse(r2.equals(new Object()));

        RationalValue r3 = new RationalValue(new IntValue(2), new IntValue(3));
        RationalValue r4 = new RationalValue(new IntValue(2), new IntValue(3));
        assertTrue(r3.equals(r4));

        RationalValue r5 = new RationalValue(new IntValue(2), new IntValue(3));
        RationalValue r6 = new RationalValue(new IntValue(3), new IntValue(2));
        assertFalse(r5.equals(r6));

        RationalValue r7 = new RationalValue(new IntValue(2), new IntValue(1));
        IntValue intValue = new IntValue(2);
        assertTrue(r7.equals(intValue));

        RationalValue r8 = new RationalValue(new IntValue(2), new IntValue(1));
        IntValue i = new IntValue(3);
        assertFalse(r8.equals(i));
    }

    @Test
    void testIsPositive(){
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        assertTrue(r.isPositive());

        RationalValue r2 = new RationalValue(new IntValue(-1), new IntValue(2));
        assertFalse(r2.isPositive());

        RationalValue r3 = new RationalValue(new IntValue(1), new IntValue(-2));
        assertFalse(r3.isPositive());

        RationalValue r4 = new RationalValue(new IntValue(-1), new IntValue(-2));
        assertTrue(r4.isPositive());
    }

}
