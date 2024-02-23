package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import visitor.ExpressionVisitor;

import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.List;


class TestNotation {

    /* This is an auxiliary method to avoid code duplication.
     */
	void testNotation(String s,Operation o,Notation n) {
		ExpressionVisitor ev = new ExpressionVisitor();
		ev.setNotation(n);
		o.accept(ev);
		assertEquals(s, ev.getExpression());
	}

	/* This is an auxiliary method to avoid code duplication.
     */
	void testNotations(String symbol,int value1,int value2,Operation op) {
		//prefix notation:
		testNotation(symbol +" (" + value1 + ", " + value2 + ")", op, Notation.PREFIX);
		//infix notation:
		testNotation("( " + value1 + " " + symbol + " " + value2 + " )", op, Notation.INFIX);
		//postfix notation:
		testNotation("(" + value1 + ", " + value2 + ") " + symbol, op, Notation.POSTFIX);
	}

	@ParameterizedTest
	@ValueSource(strings = {"*", "+", "/", "-"})
	void testOutput(String symbol) {
		int value1 = 8;
		int value2 = 6;
		Operation op = null;
		List<Expression> params = Arrays.asList(new MyNumber(value1),new MyNumber(value2));
		try {
			//construct another type of operation depending on the input value
			//of the parameterised test
			switch (symbol) {
				case "+"	->	op = new Plus(params);
				case "-"	->	op = new Minus(params);
				case "*"	->	op = new Times(params);
				case "/"	->	op = new Divides(params);
				default		->	fail();
			}
		} catch (IllegalConstruction e) {
			fail();
		}
		testNotations(symbol, value1, value2, op);
	}

	@ParameterizedTest
	@EnumSource(Notation.class)
	void testCompositeExpressionpusjNotations(Notation notation){
		try {
			MyNumber num1 = new MyNumber(3);
			MyNumber num2 = new MyNumber(4);
			MyNumber num3 = new MyNumber(5);
			MyNumber num4 = new MyNumber(5);
			MyNumber num5 = new MyNumber(4);
			MyNumber num6 = new MyNumber(7
			);

			// Creator of Operator
			Plus plus = new Plus(Arrays.asList(num1, num2, num3));
			Minus minus = new Minus(Arrays.asList(num4, num5));
			Divides divides = new Divides(Arrays.asList(plus, minus, num6));

			String expected = "";
			switch(notation) {
				case PREFIX -> expected ="/ (+ (3, 4, 5), - (5, 4), 7)";
				case INFIX -> expected = "( ( 3 + 4 + 5 ) / ( 5 - 4 ) / 7 )";
				case POSTFIX -> expected = "((3, 4, 5) +, (5, 4) -, 7) /";
				default -> fail();
			}
			testNotation(expected, divides, notation);
		} catch (IllegalConstruction e) {
			fail();
		}
	}
}
