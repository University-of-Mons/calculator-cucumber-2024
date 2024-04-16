package calculator;

import back.calculator.types.IntValue;
import back.calculator.types.RationalValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRational {

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
        // Make a test similar than above but with an integer
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

        // Add a test for line 120
        RationalValue r6 = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r7 = new RationalValue(new IntValue(1), new IntValue(2));
        IntValue i2 = (IntValue) r6.sub(r7);
        assertEquals(0, i2.getValue());
    }

    @Test
    void testMul() {
        RationalValue r = new RationalValue(new IntValue(1), new IntValue(2));
        IntValue i = new IntValue(3);
        RationalValue r_ = (RationalValue) r.mul(i);
        assertEquals(3, r_.getNum());

        RationalValue r2 = new RationalValue(new IntValue(1), new IntValue(2));
        IntValue i2 = new IntValue(2);
        IntValue r3 = (IntValue) r2.mul(i2);
        assertEquals(1, r3.getValue());


        RationalValue r4 = new RationalValue(new IntValue(1), new IntValue(2));
        RationalValue r5 = new RationalValue(new IntValue(1), new IntValue(3));
        RationalValue r6 = (RationalValue) r4.mul(r5);
        assertEquals(1, r6.getNum());
        assertEquals(6, r6.getDen());
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
