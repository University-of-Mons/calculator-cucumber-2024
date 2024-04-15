package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import parser.time.CalculatorExprTimeLexer;
import parser.time.CalculatorExprTimeParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.TimeParserVisitor;

public class TimeParser {
    public final Calculator c;
    private final ParseTree tree;

    /**
     * This is the constructor of the class
     * @param expression a string who represent the expression
     */
    public TimeParser(String expression, Calculator c){
        this.c = c;
        CharStream input = CharStreams.fromString(expression);
        CalculatorExprTimeLexer lexer = new CalculatorExprTimeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorExprTimeParser parser = new CalculatorExprTimeParser(tokens);
        tree = parser.prog();
    }

    /**
     * This method evaluate the expression
     * @return the result of the expression
     */
    //TODO A MODIFIER
    public MyNumber evaluate(){
        TimeParserVisitor visitor = new TimeParserVisitor(c);
        Expression e = visitor.visit(tree);
        return c.eval(e);
    }
}
