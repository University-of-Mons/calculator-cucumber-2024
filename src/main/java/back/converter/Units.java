package back.converter;

public class Units {
    public interface Unit {

    }

    public enum Speed implements Unit {
        METERS_PER_SECOND,
        METERS_PER_HOUR,
        KILOMETER_PER_SECOND,
        KILOMETER_PER_HOUR,
    }

    public enum Weight implements Unit {
        GRAM,
        KILOGRAM
    }

    public enum Distance implements Unit {
        METER,
        KILOMETER
    }

    public enum Time implements Unit {
        SECOND,
        HOUR
    }
}
