package back.calculator;

/**
 * Enumeration of the forms that a complex number can be represented in.
 *
 * @see back.calculator.types.MyNumber
 */
public enum ComplexForm {

    /**
     * Example: sqrt(2) + sqrt(2)i
     */
    CARTESIAN,

    /**
     * Example: 2 (cosine(pi/4) + i sine (pi/4))
     */
    POLAR,

    /**
     * Example: 2 e^(i*pi/4)
     */
    EXPONENTIAL

}
