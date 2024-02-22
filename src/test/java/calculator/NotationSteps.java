package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import visitor.ExpressionVisitor;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

public class NotationSteps {
    private int value1;
    private int value2;
    private Operation op;

    @Given("the numbers {int} and {int}")
    public void the_numbers(int num1, int num2) {
        this.value1 = num1;
        this.value2 = num2;
    }

    @When("I perform the operation {string}")
    public void i_perform_the_operation(String operation) {
        List<Expression> params = Arrays.asList(new MyNumber(value1),new MyNumber(value2));
        try {
            switch (operation) {
                case "+" -> this.op = new Plus(params);
                case "-" -> this.op = new Minus(params);
                case "*" -> this.op = new Times(params);
                case "/" -> this.op = new Divides(params);
                default -> fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Then("I should get the correct notation for {string}")
    public void i_should_get_the_correct_notation_for(String operation) {
        testNotation(operation +" (" + value1 + ", " + value2 + ")", op, Notation.PREFIX);
        testNotation("( " + value1 + " " + operation + " " + value2 + " )", op, Notation.INFIX);
        testNotation("(" + value1 + ", " + value2 + ") " + operation, op, Notation.POSTFIX);
    }

    void testNotation(String s,Operation o,Notation n) {
        ExpressionVisitor ev = new ExpressionVisitor();
        ev.setNotation(n);
        o.accept(ev);
        assertEquals(s, ev.getExpression());
    }
}
