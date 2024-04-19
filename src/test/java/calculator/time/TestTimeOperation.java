package calculator.time;

import calculator.Counting;
import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import calculator.operators.time.Plus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import visitor.CountingVisitor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTimeOperation {

    private TimeOperation o;
    private TimeOperation o2;

    @BeforeEach
    void setup() throws Exception{
        List<Expression> params1 = List.of(new MyTime(3, 0, 0), new  MyTime(0, 1, 0));
        List<Expression> params2 = List.of(new MyTime(5, 0, 0), new MyTime(4, 0, 30));
        List<Expression> params3 = List.of(new Plus(params1), new Plus(params2), new MyTime(3, 29, 0));
        o = new Plus(params3);
        o2 = new Plus(params3);
    }

    @Test
    void testEquals() {
        assertEquals(o, o2);
    }

    @Test
    void testCountDepth() {
        CountingVisitor cv = new CountingVisitor();
        cv.setMode(Counting.DEPTH);
        o.accept(cv);
        assertEquals(2, cv.getValue());
    }

    @Test
    void testCountOps() {
        CountingVisitor cv = new CountingVisitor();
        cv.setMode(Counting.COUNT_OPS);
        o.accept(cv);
        assertEquals(3, cv.getValue());
    }

    @Test
    void testCountNbs() {
        CountingVisitor cv = new CountingVisitor();
        cv.setMode(Counting.COUNT_NBS);
        o.accept(cv);
        assertEquals(Integer.valueOf(5), cv.getValue());
    }
}
