package org.rrgames.math.geometry;

import java.util.Map;

import org.rrgames.math.geometry.objects.Circle;
import org.rrgames.math.geometry.objects.Rectangle;

public final class ObjectArea {

    private ObjectArea() {}

    public static double calculate(GeometricalObject object, Map<String, Double> variables) {
        if (object instanceof Rectangle) {
            if (!variables.containsKey("a") || !variables.containsKey("b")) {
                throw new IllegalArgumentException("Rectangle requires variables: a, b");
            }
            return variables.get("a") * variables.get("b");
        }
        
        if (object instanceof Circle) {
            if (!variables.containsKey("r")) {
                throw new IllegalArgumentException("Circle requires variable: r");
            }
            return Math.PI * Math.pow(variables.get("r"), 2);
        }
        if (object instanceof Rectangle) {
            if (!variables.containsKey("a") || !variables.containsKey("b") || !variables.containsKey("c")) {
                throw new IllegalArgumentException("Triangle requires Variable: a, b, c");
            }
            return (1.0/2.0) * variables.get("a") * variables.get("b");
        }
        throw new UnsupportedOperationException("Unknown geometrical object type.");
    }
}