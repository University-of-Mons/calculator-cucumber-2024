package back.calculator;

import back.calculator.operators.Modulus;
import back.calculator.types.MyNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is necessary for the compilation of the .jar file. See issue #16 for more information.
 */
public class Main {
    public static void main(String[] args) {
        // App.main(args);
        Expression e;
        Calculator c = new Calculator();

        try {

            e = new MyNumber(8);
            c.print(e);
            c.eval(e);

            List<Expression> params = new ArrayList<>();
            Collections.addAll(params, new MyNumber(3, 4));
            e = new Modulus(params);
            c.print(e);
            c.eval(e);
        } catch (IllegalConstruction exception) {
            System.out.println("cannot create operations without parameters");
        }
    }
}