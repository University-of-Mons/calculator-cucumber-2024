package back.calculator;

/**
 *  This class is necessary for the compilation of the .jar file. See issue #16 for more information.
 */
public class Main {
    public static void main(String[] args) {
        //App.main(args);

        Calculator c = new Calculator();

        Expression e = c.read("2i");
        System.out.println(e);
        Expression f = c.read("i");
        System.out.println(f);
    }
}