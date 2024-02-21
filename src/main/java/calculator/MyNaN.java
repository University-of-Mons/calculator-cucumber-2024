package calculator;

public class MyNaN extends MyNumber {
    // TODO : MyNaN should extend a common class with MyNumber

    /**
     * Constructor method
     */
    public MyNaN() {
        super(0);
    }

    @Override
    public boolean equals(Object o) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (o == null) return false;

        // If the object is of another type then return false
        return o instanceof MyNumber;
    }
}
