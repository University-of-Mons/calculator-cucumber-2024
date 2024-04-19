package back.converter;

import java.util.ArrayList;
import java.util.List;

public class Units {
    private Units() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * @return A list of all unit types (speed, weight...) as classes.
     */
    public static List<Class<? extends Unit>> getUnitClasses() {
        List<Class<? extends Unit>> unitClasses = new ArrayList<>();
        unitClasses.add(Speed.class);
        unitClasses.add(Weight.class);
        unitClasses.add(Distance.class);
        unitClasses.add(Time.class);
        unitClasses.add(Angles.class);
        return unitClasses;
    }

    public interface Unit {
        String getSymbol();
    }

    public enum Speed implements Unit {
        METERS_PER_SECOND {
            @Override
            public String getSymbol() {
                return "m/s";
            }
        },
        METERS_PER_HOUR {
            @Override
            public String getSymbol() {
                return "m/h";
            }
        },
        KILOMETER_PER_SECOND {
            @Override
            public String getSymbol() {
                return "km/s";
            }
        },
        KILOMETER_PER_HOUR {
            @Override
            public String getSymbol() {
                return "km/h";
            }
        }
    }

    public enum Weight implements Unit {
        GRAM {
            @Override
            public String getSymbol() {
                return "g";
            }
        },
        KILOGRAM {
            @Override
            public String getSymbol() {
                return "kg";
            }
        }
    }

    public enum Distance implements Unit {
        METER {
            @Override
            public String getSymbol() {
                return "m";
            }
        },
        KILOMETER {
            @Override
            public String getSymbol() {
                return "km";
            }
        }
    }

    public enum Time implements Unit {
        SECOND {
            @Override
            public String getSymbol() {
                return "s";
            }
        },
        HOUR {
            @Override
            public String getSymbol() {
                return "h";
            }
        }
    }

    public enum Angles implements Unit {
        DEGREE {
            @Override
            public String getSymbol() {
                return "°";
            }
        },
        RADIAN {
            @Override
            public String getSymbol() {
                return "rad";
            }
        }
    }
}
