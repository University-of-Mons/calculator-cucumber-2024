package calculator;

import org.antlr.v4.runtime.*;
import parser.calculatorLexer;
import parser.calculatorParser;
import visitor.CalculatorParserVisitor;

public class ExpressionParser {


    /**
     * Parse a String and return the corresponding expression.
     * @param expression String to parse
     * @return The corresponding expression object representing the input
     */
    public Expression parse(String expression) {
        CharStream input = CharStreams.fromString(expression);
        calculatorLexer lexer = new calculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calculatorParser parser = new calculatorParser(tokens);
        CalculatorParserVisitor visitor = new CalculatorParserVisitor();
        return visitor.visit(parser.prog());
    }
}
