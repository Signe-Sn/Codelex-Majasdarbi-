package oop.imperialToMetric;

public enum ConversionType {

    METERS_TO_YARDS {
        @Override
        public double converter(int value) {
            return value * 1.0936;
        }
    },

    YARDS_TO_METERS {
        @Override
        public double converter(int value) {
            return value * 0.9144;
        }
    },

    CENTIMETERS_TO_INCHES {
        @Override
        public double converter(int value) {
            return value / 2.54;
        }
    },

    INCHES_TO_CENTIMETERS {
        @Override
        public double converter(int value) {
            return value * 2.54;
        }
    },

    KILOMETERS_TO_MILES {
        @Override
        public double converter(int value) {
            return value * 0.6314;
        }
    },

    MILES_TO_KILOMETERS {
        @Override
        public double converter(int miles) {
            return miles * 1.6;
        }
    };

    public abstract double converter(int value);
}
