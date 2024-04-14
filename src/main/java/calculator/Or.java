package calculator;

import java.util.List;

/** This class represents the boolean operation "OR".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see And
 * @see Not
 * @see Xor
 */
public class Or extends Operation {

    /**
     * Class constructor specifying a number of Expressions to OR.
     *
     * @param elist The list of Expressions to OR
     * @throws IllegalConstruction    If an empty list of expressions is passed as parameter
     */
    public Or(List<Expression> elist) throws IllegalConstruction {
        super(elist);
        symbol = "|";
        neutral = 0;
    }

    @Override
    public int op(int l, int r) {
        return l | r;
    }
}
