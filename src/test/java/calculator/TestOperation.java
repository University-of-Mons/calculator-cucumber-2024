package calculator;

//Import Junit5 libraries for unit testing:

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import visitor.CountDepth;
import visitor.CountNbs;
import visitor.CountOps;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestOperation {

    private Operation<Integer> o;
    private Operation<Integer> o2;

    @BeforeEach
    void setUp() throws Exception {
        List<Expression<Integer>> params1 = Arrays.asList(new MyNumber(3), new MyNumber(4), new MyNumber(5));
        List<Expression<Integer>> params2 = Arrays.asList(new MyNumber(5), new MyNumber(4));
        List<Expression<Integer>> params3 = Arrays.asList(new Plus<>(params1), new Minus<>(params2), new MyNumber(7));
        o = new Divides<>(params3);
        o2 = new Divides<>(params3);
    }

    @Test
    void testEquals() {
        assertEquals(o, o2);
    }

	@Test
	void testCountDepth() {
		CountDepth<Integer> cd = new CountDepth<>();
		o.accept(cd);
		assertEquals(2, cd.getDepth());
	}

	@Test
	void testCountOps() {
		CountOps<Integer> co = new CountOps<>();
		o.accept(co);
		assertEquals(3, co.getOps());
	}

	@Test
	void testCountNbs() {
		CountNbs<Integer> cn = new CountNbs<>();
		o.accept(cn);
		assertEquals(Integer.valueOf(6), cn.getNbs());
	}

}
