package tms.c29.lec_10.classwork.point_2;

public enum Apple {
    RED(12, "USA") {
        @Override
        public double toPounds() {
            return this.getKg() * POUND_INDEX;
        }
    },
    GREEN(13, "Belarus") {
        @Override
        public double toPounds() {
            return this.getKg() * POUND_INDEX;
        }
    },
    WHITE_GOLDEN(14, "Poland") {
        @Override
        public double toPounds() {
            return this.getKg() * POUND_INDEX;
        }
    };

    private int kg;
    private String country;
    private static final double POUND_INDEX = 1.6;

    Apple(int kg, String country) {
        this.kg = kg;
        this.country = country;
    }

    public int getKg() {
        return kg;
    }

    public String getCountry() {
        return country;
    }

    public abstract double toPounds();
}
