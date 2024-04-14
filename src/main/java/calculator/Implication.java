package calculator;

import java.util.List;

/**
 * This class represents the boolean operation "IMPLICATION".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Or
 * @see Not
 * @see Xor
 */
public class Implication extends Operation {
    /**
     * Class constructor specifying a number of Expressions to IMPLICATION.
     *
     * @param elist The list of Expressions to IMPLICATION
     * @throws IllegalConstruction    If an empty list of expressions is passed as parameter
     */
    public Implication(List<Expression> elist) throws IllegalConstruction {
        super(elist);
        symbol = "=>";
        neutral = 1;
    }

    @Override
    public int op(int l, int r) {
        return (l == 1 && r == 0) ? 0 : 1;
    }
}
