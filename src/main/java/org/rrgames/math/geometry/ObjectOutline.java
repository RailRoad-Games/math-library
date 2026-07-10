package org.rrgames.math.geometry;

import java.util.Map;

import org.rrgames.math.geometry.objects.*;

public final class ObjectOutline {

    private ObjectOutline() {}

    public static double calculate(GeometricalObject object, Map<String, Double> variables) {
        if (object instanceof Rectangle) {
            if (!variables.containsKey("a") || !variables.containsKey("b")) {
                throw new IllegalArgumentException("Rectangle perimeter requires variables: a, b");
            }
            return 2 * (variables.get("a") + variables.get("b"));
        }

        if (object instanceof Circle) {
            if (!variables.containsKey("r")) {
                throw new IllegalArgumentException("Circle perimeter requires variable: r");
            }
            return 2 * Math.PI * variables.get("r");
        }

        if (object instanceof Triangle) {
            if (!variables.containsKey("a") || !variables.containsKey("b") || !variables.containsKey("c")) {
                throw new IllegalArgumentException("Triangle perimeter requires variables: a, b, c");
            }
            return variables.get("a") + variables.get("b") + variables.get("c");
        }

        throw new UnsupportedOperationException("Unknown geometrical object type.");
    }
}