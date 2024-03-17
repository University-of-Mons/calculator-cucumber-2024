package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.operators.Divides;
import calculator.operators.Minus;
import calculator.operators.Plus;
import calculator.operators.Times;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A very simple calculator in Java
 * University of Mons - UMONS
 * Software Engineering Lab
 * Faculty of Sciences
 *
 * @author tommens
 */
public class Main {
	/**
	 * The constructor is private because this class is not meant to be instantiated.
	 */
	private Main() {
	// nothing to be done
	}

	/**
	 * This is the main method of the application.
	 * It provides examples of how to use it to construct and evaluate arithmetic expressions.
	 *
	 * @param args	Command-line parameters are not used in this version
	 */
	public static void main(String[] args) {


  	Expression e;
  	Calculator c = new Calculator();

	try {
		e = new MyNumber(8);
		c.print(e, Notation.PREFIX);
		c.eval(e);

	    List<Expression> params = new ArrayList<>();
	    Collections.addAll(params, new MyNumber(3), new MyNumber(4), new MyNumber(5));
	    e = new Plus(params);
		c.printExpressionDetails(e,Notation.PREFIX);
		c.eval(e);

		List<Expression> params2 = new ArrayList<>();
		Collections.addAll(params2, new MyNumber(5), new MyNumber(3));
		e = new Minus(params2);
		c.print(e,Notation.INFIX);
		c.eval(e);

		List<Expression> params3 = new ArrayList<>();
		Collections.addAll(params3, new Plus(params), new Minus(params2));
		e = new Times(params3);
		c.printExpressionDetails(e,Notation.PREFIX);
		c.eval(e);

		List<Expression> params4 = new ArrayList<>();
		Collections.addAll(params4, new Plus(params), new Minus(params2), new MyNumber(5));
		e = new Divides(params4);
		c.print(e,Notation.POSTFIX);
		c.eval(e);


		System.out.println("(3+4+5)*(5-3) = 24");
		Parser p= new Parser("(3+4+5)*(5-3)",c);
		MyNumber r= p.evaluate();
		System.out.println(r.getValue());

		System.out.println("*(+(3,4,5),-(5,3)) = 24");
		p= new Parser("*(+(3,4,5),-(5,3))",c);
		r= p.evaluate();
		System.out.println(r.getValue());

		//System.out.println("(4,5)+, 2)* = 18");
		Parser parser = new Parser("((4,5,6)+,(7,(5,2,7)/)+,9)*",c);
		System.out.println(parser.evaluate().getValue());


	}
	catch(IllegalConstruction exception) {
		Logger logger = Logger.getLogger(Main.class.getName());
		logger.log(Level.INFO,() -> "cannot create operations without parameters");
	}
 	}
}
