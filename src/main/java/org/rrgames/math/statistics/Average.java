package org.rrgames.math.statistics;
public class Average {
    public static Double get(Double... valuez) {
        double toreturn = 0;
        for (Double d : valuez) {
            toreturn += d;
        }
        return toreturn / valuez.length;
    }
}
