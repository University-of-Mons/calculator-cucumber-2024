package back.calculator;


import back.calculator.types.IntValue;
import back.calculator.types.MyNumber;
import back.calculator.types.RealValue;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * This class is necessary for the compilation of the .jar file. See issue #16 for more information.
 */
public class Main {
    public static void main(String[] args) {
        //App.main(args);

        MyNumber n = new MyNumber(new IntValue(1), new RealValue(new BigDecimal("2.689", new MathContext(5))));
        System.out.println(n);
    }
}