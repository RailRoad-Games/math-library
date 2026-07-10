package org.rrgames.math.statistics;

public class Percentile {
    public double percentile;

    public Percentile(Double percentile, boolean isInteger) {
        if (isInteger)
            this.percentile = percentile;
        else {
            this.percentile = percentile * 100;
        }
    }

    public double getPercentile() {
        return percentile;
    }

    public void setPercentile(double percentile) {
        this.percentile = percentile * 100;
    }

    public static Percentile get(double max, double value) {
        return new Percentile(value / max, false);
    }

    public static Double get(double max, Percentile percentile) {
        return max * (percentile.getPercentile() / 100);
    }

    public static Double get(Percentile percentile, double value) {
        return value / (percentile.getPercentile() / 100);
    }

    @Override
    public String toString() {
        return percentile + " %";
    }
}
