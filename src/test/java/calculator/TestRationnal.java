package calculator;

import back.calculator.types.IntValue;
import back.calculator.types.RationalValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRationnal {

    @Test
    void testConstructor() {
        // Test the constructor with two integers
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        assertEquals(1, r.getNum());
        assertEquals(2, r.getDen());

        // Test the constructor with a rational and an integer
        RationalValue r2 = new RationalValue(r, new IntValue(3));
        assertEquals(1, r2.getNum());
        assertEquals(6, r2.getDen());

        // Test the constructor with an integer and a rational
        RationalValue r3 = new RationalValue(new IntValue(3), r);
        assertEquals(6, r3.getNum());
        assertEquals(1, r3.getDen());

        // Test the constructor with two rationals
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
        RationalValue r2 = new RationalValue(new IntValue(1), new IntValue(3));
        RationalValue r3 = (RationalValue) r.add(r2);
        assertEquals(5, r3.getNum());
        assertEquals(6, r3.getDen());
    }

    @Test
    void testSub() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r2 = new RationalValue(new IntValue(1), new IntValue(3));
        RationalValue r3 = (RationalValue) r.sub(r2);
        assertEquals(1, r3.getNum());
        assertEquals(6, r3.getDen());
    }

    @Test
    void testMul() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r2 = new RationalValue(new IntValue(1), new IntValue(3));
        RationalValue r3 = (RationalValue) r.mul(r2);
        assertEquals(1, r3.getNum());
        assertEquals(6, r3.getDen());
    }

    @Test
    void testDiv() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r2 = new RationalValue(new IntValue(1), new IntValue(3));
        RationalValue r3 = (RationalValue) r.div(r2);
        assertEquals(3, r3.getNum());
        assertEquals(2, r3.getDen());
    }

    @Test
    void testEquals() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r2 = new RationalValue(new IntValue(1), new IntValue(2));
        assertEquals(r, r2);
    }

}
