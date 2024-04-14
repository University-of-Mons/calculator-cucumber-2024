package calculator;

import java.util.List;

/** This class represents the boolean operation "XOR".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see And
 * @see Not
 * @see Or
 */
public class Xor extends Operation {

    /**
     * Class constructor specifying a number of Expressions to XOR.
     *
     * @param elist The list of Expressions to XOR
     * @throws IllegalConstruction    If an empty list of expressions is passed as parameter
     */
    public Xor(List<Expression> elist) throws IllegalConstruction {
        super(elist);
        symbol = "^";
        neutral = 0;
    }

    @Override
    public int op(int l, int r) {
        return l ^ r;
    }
}
