package visitor;

import calculator.Expression;
import calculator.MyNumber;
import calculator.Operation;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ExpressionVisitor extends Visitor {

    public ExpressionVisitor() {}

    /** The result of the evaluation will be stored in this private variable */
    private String result;

    /** getter method to obtain the result of the evaluation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public String getResult() { return result; }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        result = n.toString();
    }

    /** Use the visitor design pattern to visit an operation
     *
     * @param o The operation being visited
     */
    public void visit(Operation o) {
        ArrayList<String> s = new ArrayList<>();
        for(Expression a:o.args) {
            a.accept(this);
            s.add(result);
        }
        Stream<String> stream = s.stream();
        result = switch (o.notation) {
            case INFIX -> "( " +
                    stream.reduce((s1, s2) -> s1 + " " + o.getSymbol() + " " + s2).get() +
                    " )";
            case PREFIX -> o.getSymbol() + " " +
                    "(" +
                    stream.reduce((s1, s2) -> s1 + ", " + s2).get() +
                    ")";
            case POSTFIX -> "(" +
                    stream.reduce((s1, s2) -> s1 + ", " + s2).get() +
                    ")" +
                    " " + o.getSymbol();
        };
    }
}
