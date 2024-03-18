package calculator;

import calculator.operand.MyNumber;
import calculator.operation.Operation;
import calculator.operation.Operator;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Slf4j
public class Parser<T> {

    private final Map<String, Operation<T>> operatorMap = Operator.getMap();

    class ParserResult {
        private final Expression<T> e;
        private final int i;

        public ParserResult(Expression<T> e, int i) {
            this.e = e;
            this.i = i;
        }
    }

    public Expression<T> parse(String s, From<T> parser) {
        return parseRec(s.strip().trim().toLowerCase(), parser, 0, 0).e;
    }

    private ParserResult parseRec(String s, From<T> parser, int i, int priority) {
        Expression<T> left = null;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isSpaceChar(c)) {
                i += 1;
            } else if (Character.isDigit(c)) {
                ParserResult res = parseValue(s, parser, i);
                i = res.i;
                left = res.e;
            } else {
                ParserResult opRes = parseOp(s, i);
                Operation<T> operator = (Operation<T>) opRes.e;
                i = opRes.i;
                if (priority > operator.getPriority()) {
                    return new ParserResult(left, i);
                }

                i += 1;
                ParserResult res = parseRec(s, parser, i, operator.getPriority());
                Expression<T> right = res.e;
                i = res.i;
                try {
                    Constructor<Operation<T>> constructor = (Constructor<Operation<T>>) operator.getClass().getConstructor(List.class);
                    left = constructor.newInstance(Arrays.asList(left, right));
                } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                         InvocationTargetException e) {
                    log.error("HAAAAAAAAAAAAAAAA : {}", e.toString());

                }
            }
        }
        return new ParserResult(left, i);
    }

    private ParserResult parseValue(String s, From<T> parser, int i) {
        StringBuilder num = new StringBuilder();
        char c;
        do {
            c = s.charAt(i);
            num.append(c);
            i += 1;
        } while (i < s.length() && Character.isDigit(s.charAt(i)));

        return new ParserResult(parser.fromString(num.toString()), i);
    }

    private ParserResult parseOp(String s, int i) {
        String op;

        char c = s.charAt(i);
        if (Character.isAlphabetic(c)) {
            StringBuilder subop = new StringBuilder();
            do {
                c = s.charAt(i);
                subop.append(c);
                i += 1;
            } while (i < s.length() && Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i)));
            op = subop.toString();
        } else {
            op = String.valueOf(c);
        }
        Operation<T> operator = operatorMap.get(op);
        if (operator == null) {
            log.error("\"{}\" not yet supported", op);
            return new ParserResult(null, i);
        }
        return new ParserResult(operator, i);
    }

    @FunctionalInterface
    public interface From<T> {
        Value<T> fromString(String s);
    }

    public static Value<Integer> stringToInteger(String s) {
        return new MyNumber(Integer.parseInt(s));
    }
}
