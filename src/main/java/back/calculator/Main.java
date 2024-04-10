package back.calculator;

import back.calculator.operators.Modulus;
import back.calculator.operators.Plus;
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
            ArrayList<Expression> p = new ArrayList<>();
            Collections.addAll(p, new MyNumber(3), new MyNumber(4), new MyNumber(7));
            e = new Plus(p);
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