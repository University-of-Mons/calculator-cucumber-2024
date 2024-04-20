package calculator;

import back.calculator.App;
import back.calculator.types.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.jupiter.api.Assertions.*;

class TestReal {

    MathContext precision = App.getPrecision();

    @Test
    void testConstructor(){
        RealValue r = new RealValue(new BigDecimal("1.5", precision));
        assertEquals(1.5, r.getValue().doubleValue());
        assertEquals(Type.REAL, r.getType());
    }

    @Test
    void testEquals(){
        RealValue r = new RealValue(new BigDecimal("1.5", precision));
        RealValue r2 = new RealValue(new BigDecimal("1.5", precision));
        RealValue r3 = new RealValue(new BigDecimal("2.5", precision));
        assertEquals(r, r2);
        assertEquals(r, r);
        assertNotEquals(r, r3);

        assertNotEquals(r, new MyNumber(r));

        IntValue i = new IntValue(1);
        assertNotEquals(r, i); //NOSONAR
    }


}
