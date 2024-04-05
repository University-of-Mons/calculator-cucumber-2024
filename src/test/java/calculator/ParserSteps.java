package calculator;

import static org.junit.jupiter.api.Assertions.*;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class ParserSteps {

	private Calculator c;
	private Parser inputParser;
	@Given("I have a number {string}")
	public void givenIHaveANumber(String s) {
		c = new Calculator();
		inputParser = new Parser(s, c);
	}
	@Given("I have an expression {string}")
	public void givenIHaveAnExpression(String s) {
		c = new Calculator();
		inputParser = new Parser(s, c);
	}

	@Then("I should get a number {int}")
	public void thenIShouldGetANumber(int number) {
		assertEquals(number, inputParser.evaluate().getValue());
	}
	@Then("the result is  {int}")
	public void thenTheResultIs(int result) {
		assertEquals(result, inputParser.evaluate().getValue());
	}
}