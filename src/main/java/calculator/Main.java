package calculator;

/**
 * A very simple calculator in Java
 * University of Mons - UMONS
 * Software Engineering Lab
 * Faculty of Sciences
 *
 * @author tommens
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        BooleanParser parser = new BooleanParser("NOT 0", calculator);
        System.out.println("Answer :" + parser.evaluate().getValue());
        //AppStarter.main(args);
    }
}
