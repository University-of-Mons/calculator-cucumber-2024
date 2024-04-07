package calculator;

import calculator.operand.MyNumber;
import calculator.parser.CalculatorLexer;
import calculator.parser.CalculatorParser;
import calculator.parser.VisitorParser;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

@NoArgsConstructor
@Slf4j
public class Parser<T> {

    public Expression<T> parse(String s, From<T> baseParser) throws IllegalExpression{
        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.equation();
        VisitorParser<T> visitorParser = new VisitorParser<>(baseParser);
        return visitorParser.visit(tree);
    }

    @FunctionalInterface
    public interface From<T> {
        Value<T> fromString(String s);
    }

    public static Value<Integer> stringToInteger(String s) {
        return new MyNumber(Integer.parseInt(s));
    }
}
