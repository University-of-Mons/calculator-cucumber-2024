package visitor;

import calculator.Expression;
import calculator.MyNumber;
import calculator.Notation;
import calculator.Operation;

public class Printer extends Visitor {
    private Notation notation = Notation.INFIX;
    private String computedValue = "";

    /**
     * Custom notation constructor.
     *
     * @param notation The custom notation to use
     */
    public Printer(Notation notation) {
        this.notation = notation;
    }

    /**
     * Default INFIX constructor.
     */
    public Printer() {
    }

    /**
     * Notation setter.
     */
    public void setNotation(Notation notation) {
        this.notation = notation;
    }


    @Override
    public void visit(MyNumber n) {
        this.computedValue = n.toString();
    }

    @Override
    public void visit(Operation o) {
        StringBuilder bobTheBuilder = new StringBuilder();
        switch (notation) {
            case PREFIX -> {
                bobTheBuilder.append(o.getSymbol());
                bobTheBuilder.append(" (");
                for (Expression expression : o.getArgs()) {
                    expression.accept(this);
                    bobTheBuilder.append(computedValue);
                    bobTheBuilder.append(" ");
                }
                bobTheBuilder.append(")");
            }
            case INFIX -> {
                bobTheBuilder.append("(");
                int index = 0;
                for (Expression expression : o.getArgs()) {
                    expression.accept(this);
                    bobTheBuilder.append(computedValue);
                    // If condition prevents the existence of a trailing symbol ('1 + 2 + 3' instead of '1 + 2 + 3 +')
                    if (index != o.getArgs().size() - 1) {
                        bobTheBuilder.append(o.getSymbol());
                        bobTheBuilder.append(" ");
                        index++;
                    }
                }
                bobTheBuilder.append(")");
            }
            case POSTFIX -> {
                bobTheBuilder.append("(");
                for (Expression expression : o.getArgs()) {
                    expression.accept(this);
                    bobTheBuilder.append(computedValue);
                    bobTheBuilder.append(" ");
                }
                bobTheBuilder.append(") ");
                bobTheBuilder.append(o.getSymbol());
            }
        }
        this.computedValue = bobTheBuilder.toString();
    }

    /**
     * Notation getter
     */
    public Notation getNotation() {
        return notation;
    }

    public String getComputedValue() {
        return computedValue;
    }
}
