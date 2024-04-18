package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.ComplexNumber.*;
import visitor.ComplexParserVisitor;

public class ComplexNumberParser {

    public final Calculator c;
    private final ParseTree tree;

    public ComplexNumberParser(String expression, Calculator c){
        this.c = c;
        CharStream input = CharStreams.fromString(expression);
        ComplexExprLexer lexer = new ComplexExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ComplexExprParser parser = new ComplexExprParser(tokens);
        tree = parser.prog();
    }

    public MyNumber evaluate(){
        ComplexParserVisitor visitor = new ComplexParserVisitor(c);
        Expression e = visitor.visit(tree);
        return c.eval(e);
    }
}
