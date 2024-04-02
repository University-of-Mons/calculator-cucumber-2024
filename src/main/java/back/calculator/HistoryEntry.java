package back.calculator;

public class HistoryEntry {
    private Expression expression;
    private MyNumber result;

    public HistoryEntry(Expression expression, MyNumber result) {
        this.expression = expression;
        this.result = result;
    }

    @Override
    public String toString() {
        StringBuilder bobTheBuilder = new StringBuilder();
        bobTheBuilder.append(expression.toString());
        bobTheBuilder.append(" was evaluated to ");
        bobTheBuilder.append(result.toString());
        return bobTheBuilder.toString();
    }
}