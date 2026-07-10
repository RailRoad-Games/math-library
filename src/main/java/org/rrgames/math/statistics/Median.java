package org.rrgames.math.statistics;

import java.util.Arrays;
import java.util.List;

public class Median {
    public static Double get(Double... values) {
        if (values == null || values.length == 0) {
            return 0.0; 
        }

        Arrays.sort(values);
        List<Double> listedValues = Arrays.asList(values);
        
        int size = listedValues.size();
        if (size % 2 == 0) {
            return Average.get(listedValues.get(size / 2 - 1), listedValues.get(size / 2));
        } else {
            return listedValues.get(size / 2);
        }
    }
}