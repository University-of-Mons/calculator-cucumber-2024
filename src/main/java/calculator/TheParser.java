package calculator;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

class TheParser{

    private ParserCalculatorParser ourParser;
    private final ParserVisitor visitor= new ParserVisitor();
    private final Calculator c = new Calculator();

    /**
     * This is the constructor of the class
     * @param expression a string who represent the expression
     */
    public TheParser(String expression){
        ANTLRInputStream input = new ANTLRInputStream(expression);
        ParserCalculatorLexer lexer = new ParserCalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        this.ourParser = new ParserCalculatorParser(tokens);
    }


    /**
     * This method evaluate the expression
     * @return the result of the expression
     */
    public MyNumber evaluate(){
        ParseTree tree = ourParser.expre();
        Expression e= visitor.visit(tree);
        return c.eval(e);
    }
}