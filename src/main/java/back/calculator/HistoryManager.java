package back.calculator;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class HistoryManager implements Observer {
    private final ArrayList<HistoryEntry> historyEntries = new ArrayList<>();

    public HistoryManager() {}

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof HistoryEntry) {
            historyEntries.add((HistoryEntry) arg);
            for (HistoryEntry e : historyEntries) {
                // TODO: remove this print statement
                System.out.println(e);
            }
            // TODO: remove this print statement
            System.out.println();
        } else {
            // TODO : throw new error
        }
    }

    public MyNumber evaluate() {
        return new MyNumber(0);
    }
}