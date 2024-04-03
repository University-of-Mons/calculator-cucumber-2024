package calculator;

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
public class FakeMain {
	/**
	 * The constructor is private because this class is not meant to be instantiated.
	 */
	private FakeMain() {
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
	}
	catch(IllegalConstruction exception) {
		Logger logger = Logger.getLogger(FakeMain.class.getName());
		logger.log(Level.INFO,() -> "cannot create operations without parameters");
	}
 	}
}
