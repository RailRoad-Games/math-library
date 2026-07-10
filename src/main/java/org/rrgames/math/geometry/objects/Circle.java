package org.rrgames.math.geometry.objects;

import org.rrgames.math.geometry.GeometricalObject;

public class Circle implements GeometricalObject {

    @Override
    public String getAreaFormula() {
        return "pi * r^2";
    }

    @Override
    public String getPerimeterFormula() {
        return "2 * pi * r";
    }
}