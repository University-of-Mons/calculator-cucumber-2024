package calculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.calculatorLexer;
import parser.calculatorParser;
import visitor.CalculatorParserVisitor;

public class ExpressionParser {


    /**
     * Parse a String and return the corresponding expression.
     *
     * @param expression String to parse
     * @return The corresponding expression object representing the input
     */
    public Expression parse(String expression) throws IllegalConstruction {
        CharStream input = CharStreams.fromString(expression);
        calculatorLexer lexer = new calculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calculatorParser parser = new calculatorParser(tokens);

        parser.removeErrorListeners(); // Remove the default error listeners
        MySyntaxErrorListener errorListener = new MySyntaxErrorListener();
        parser.addErrorListener(errorListener); // Add our custom error listener

        ParseTree tree = parser.prog();

        if (errorListener.hasSyntaxError()) {
            // Report the syntax error
            // TODO: Log the error message here
            System.err.println(errorListener.getMessage());
            throw new IllegalConstruction();
        }

        CalculatorParserVisitor visitor = new CalculatorParserVisitor();
        return visitor.visit(tree);
    }
}
