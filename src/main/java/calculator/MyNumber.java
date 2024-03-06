package calculator;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions, just like operations are.
 *
 * @see Expression
 * @see Operation
 */
public class MyNumber extends Value<Integer>
{
  private final int value;

    /** getter method to obtain the value contained in the object
     *
     * @return The integer number contained in the object
     */
    @Override
  public Integer getVal() { return value; }

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public /*constructor*/ MyNumber(int v) {
        super(v);
        value=v;
	  }

  @Override
  public String toString() {
	  return Integer.toString(value);
  }

  /** Two MyNumber expressions are equal if the values they contain are equal
   *
   * @param o The object to compare to
   * @return  A boolean representing the result of the equality test
   */
  @Override
  public boolean equals(Object o) {
      // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
      if (o == null) return false;

      // If the object is compared to itself then return true
      if (o == this) {
          return true;
      }

      // If the object is of another type then return false
      if (!(o instanceof MyNumber)) {
            return false;
      }
      return this.value == ((MyNumber)o).value;
      // Used == since the contained value is a primitive value
      // If it had been a Java object, .equals() would be needed
  }

    /** The method hashCode needs to be overridden it the equals method is overridden;
     * 	otherwise there may be problems when you use your object in hashed collections
     * 	such as HashMap, HashSet, LinkedHashSet.
     *
     * @return	The result of computing the hash.
     */
  @Override
  public int hashCode() {
		return value;
  }

    @Override
    public Value<Integer> plus(Value<Integer> other) {
        return new MyNumber(this.getVal()+other.getVal());
    }

    @Override
    public Value<Integer> minus(Value<Integer> other) {
        return new MyNumber(this.getVal()-other.getVal());
    }

    @Override
    public Value<Integer> times(Value<Integer> other) {
        return new MyNumber(this.getVal()*other.getVal());
    }

    @Override
    public Value<Integer> div(Value<Integer> other) {
        return new MyNumber(this.getVal()/other.getVal());
    }
}
