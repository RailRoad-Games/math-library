package org.rrgames.math.geometry.objects;

import org.rrgames.math.geometry.GeometricalObject;

public class Rectangle implements GeometricalObject {

    @Override
    public String getAreaFormula() {
        return "a * b";
    }

    @Override
    public String getPerimeterFormula() {
        return "2 * (a + b)";
    }
}