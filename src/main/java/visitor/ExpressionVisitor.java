package visitor;

import calculator.Expression;
import calculator.MyNumber;
import calculator.Notation;
import calculator.Operation;

import java.util.ArrayList;
import java.util.stream.Stream;

/** ExpressionVisitor is a concrete visitor that serves to
 * compute the expression string matching the notation of arithmetic expressions.
 */
public class ExpressionVisitor extends Visitor {

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public ExpressionVisitor() {}

    /** The expression will be stored in this private variable */
    private String expression;
    /** The notation used will be stored in this private variable */
    private Notation notation;
    /** Getter method to obtain the expression
     *
     * @return a String object containing the expression
     */
    public String getExpression() { return expression; }

    /** Setter method to set the notation
     * @param notation The notation to be used
     */
    public void setNotation(calculator.Notation notation) {
        this.notation = notation;
    }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        expression = n.toString();
    }

    /** Use the visitor design pattern to visit an operation
     *
     * @param o The operation being visited
     */
    public void visit(Operation o) {
        ArrayList<String> s = new ArrayList<>();
        for(Expression a:o.args) {
            a.accept(this);
            s.add(expression);
        }
        Stream<String> stream = s.stream();
        expression = switch (notation) {
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
