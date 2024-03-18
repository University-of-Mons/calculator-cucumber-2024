package calculator.operation;

import calculator.IllegalConstruction;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Operator {
    private Operator(){}

    private static <T> List<Operation<T>> getList() {
        try {
            return Arrays.asList(new Plus<>(new ArrayList<>()), new Minus<>(new ArrayList<>()), new Divides<>(new ArrayList<>()), new Times<>(new ArrayList<>()));
        } catch (IllegalConstruction e) {
            log.error("This error should not appear !");
        }
        return Collections.emptyList();
    }

    public static <T> Map<String, Operation<T>> getMap() {
        HashMap<String, Operation<T>> map = new HashMap<>();
        for (Operation<T> op : Operator.<T>getList()) {
            map.put(op.symbol, op);
        }
        return map;
    }

}
