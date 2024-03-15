package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import gen.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.ParserVisitor;

class Parser {

    private final ParserCalculatorParser ourParser;
    public final Calculator c = new Calculator();
    private final ParseTree tree;

    /**
     * This is the constructor of the class
     * @param expression a string who represent the expression
     */
    public Parser(String expression){
        CharStream input = CharStreams.fromString(expression);
        ParserCalculatorLexer lexer = new ParserCalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ourParser = new ParserCalculatorParser(tokens);
        tree = ourParser.prog();
    }

    /**
     * This method evaluate the expression
     * @return the result of the expression
     */
    public MyNumber evaluate(){
        ParserVisitor visitor = new ParserVisitor(c);
        Expression e = visitor.visit(tree);
        return c.eval(e);
    }
}