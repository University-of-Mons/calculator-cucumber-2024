package back.converter;

public class Units {
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
}
