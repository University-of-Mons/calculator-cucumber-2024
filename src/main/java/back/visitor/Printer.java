package back.visitor;

import back.calculator.Expression;
import back.calculator.MyNumber;
import back.calculator.Notation;
import back.calculator.Operation;

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
     *
     * @param notation The notation to use
     */
    public void setNotation(Notation notation) {
        this.notation = notation;
    }

    /**
     * Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    @Override
    public void visit(MyNumber n) {
        this.computedValue = n.toString();
    }

    /**
     * Use the visitor design pattern to visit an operation
     * The operation is visited according to the notation set in the constructor.
     *
     * @param o The operation being visited
     */
    @Override
    public void visit(Operation o) {
        StringBuilder bobTheBuilder = new StringBuilder();
        switch (notation) {
            case INFIX -> {
                // The index is used to know when to add the symbol or parenthesis
                int index = o.getArgs().size() - 1;
                for (Expression expression : o.getArgs()) {
                    expression.accept(this);
                    // If index is greater than 1, and even it means that there is at least one more operation to be added
                    if (index > 1 && index % 2 == 0) {
                        bobTheBuilder.append("( ");
                        bobTheBuilder.append(computedValue);
                        bobTheBuilder.append(" ");
                        bobTheBuilder.append(o.getSymbol());
                        bobTheBuilder.append(" ");
                        index--;
                    }
                    // If index is greater or equal to 1 and odd it means that it is the second operand of the operation
                    else if (index >= 1) {
                        bobTheBuilder.append("( ");
                        bobTheBuilder.append(computedValue);
                        bobTheBuilder.append(" ");
                        bobTheBuilder.append(o.getSymbol());
                        index--;
                    }
                    // If index is 0 then it's the final operand and so the parenthesis have to be closed
                    else if (index == 0) {
                        bobTheBuilder.append(" ");
                        bobTheBuilder.append(computedValue);
                        for (int i = 0; i < o.getArgs().size() - 1; i++) {
                            bobTheBuilder.append(" )");
                        }
                    }
                }
            }
            case PREFIX -> {
                int index = o.getArgs().size() - 1;
                for (Expression expression : o.getArgs()) {
                    expression.accept(this);
                    // If index is greater than 1, it means that the operation has at least one more operand
                    if (index >= 1) {
                        bobTheBuilder.append(o.getSymbol());
                        bobTheBuilder.append(" (");
                        bobTheBuilder.append(computedValue);
                        bobTheBuilder.append(", ");
                        index--;
                    }
                    // Last operand reached, time to close parenthesis
                    else if (index == 0) {
                        bobTheBuilder.append(computedValue);
                        for (int i = 0; i < o.getArgs().size() - 1; i++) {
                            bobTheBuilder.append(")");
                        }
                    }
                }
            }
            case POSTFIX -> {
                int index = o.getArgs().size() - 1;
                for (Expression expression : o.getArgs()) {
                    expression.accept(this);
                    // If index is greater than 1, it means that the operation has at least one more operand ... (1,
                    if (index >= 1) {
                        bobTheBuilder.append("(");
                        bobTheBuilder.append(computedValue);
                        bobTheBuilder.append(", ");
                        index--;
                    }
                    // Last operand reached, time to close parenthesis and add the symbols as in postfix the symbols are added after the operands
                    else if (index == 0) {
                        bobTheBuilder.append(computedValue);
                        bobTheBuilder.append(")");
                        for (int i = 0; i < o.getArgs().size() - 2; i++) {
                            bobTheBuilder.append(" ");
                            bobTheBuilder.append(o.getSymbol());
                            bobTheBuilder.append(")");
                        }
                        bobTheBuilder.append(" ");
                        bobTheBuilder.append(o.getSymbol());
                    }
                }
            }
        }
        this.computedValue = bobTheBuilder.toString();
    }

    /**
     * Notation getter
     *
     * @return The notation used
     */
    public Notation getNotation() {
        return notation;
    }

    /**
     * Computed value getter
     *
     * @return The computed value
     */
    public String getComputedValue() {
        return computedValue;
    }
}
