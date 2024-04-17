package calculator.numbers;

import visitor.Visitor;

import java.time.LocalDateTime;

public class MyTime implements Expression{
    private LocalDateTime time;

    /** getter method to obtain the value contained in the object
     *
     * @return The integer number contained in the object
     */
    public LocalDateTime getTime() { return time; }

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public /*constructor*/ MyTime(int year, int month, int day, int hour, int minute, int second) {
        time = LocalDateTime.of(year, month, day, hour, minute, second);
    }

    public MyTime(int hour, int minute, int second) {
        time = LocalDateTime.of(0, 1, 1, hour, minute, second);
    }

    public void adjustTimeZone(int hours) {
        if (hours > 0)
            time = time.plusHours(hours);
        else
            time = time.minusHours(-hours);
    }

    public void adjustTimeFormat(String format) {
        if (format.equals("PM")) {
            time = time.plusHours(12);
        }
    }

    /**
     * accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v	The visitor object
     */
    public void accept(Visitor v) {
        v.visit(this);
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        String year = "" + time.getYear();
        String month = time.getMonthValue() < 10 ? "0" + time.getMonthValue() : "" + time.getMonthValue();
        String day = time.getDayOfMonth() < 10 ? "0" + time.getDayOfMonth() : "" + time.getDayOfMonth();
        String hour = time.getHour() < 10 ? "0" + time.getHour() : "" + time.getHour();
        String minute = time.getMinute() < 10 ? "0" + time.getMinute() : "" + time.getMinute();
        String second = time.getSecond() < 10 ? "0" + time.getSecond() : "" + time.getSecond();
        if(time.getYear() == 0 && time.getMonthValue() == 1 && time.getDayOfMonth() == 1)
            return hour + ":" + minute + ":" + second;
        else
            return year + ":" + month + ":" + day + ":" + hour + ":" + minute + ":" + second;
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
        if (!(o instanceof MyTime)) {
            return false;
        }
        return this.time.equals(((MyTime)o).time);
    }

    /** The method hashCode needs to be overridden it the equals method is overridden;
     * 	otherwise there may be problems when you use your object in hashed collections
     * 	such as HashMap, HashSet, LinkedHashSet.
     *
     * @return	The result of computing the hash.
     */
    @Override
    public int hashCode() {
        return time.hashCode();
    }

}
