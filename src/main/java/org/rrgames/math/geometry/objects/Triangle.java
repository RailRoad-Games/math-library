package org.rrgames.math.geometry.objects;

import org.rrgames.math.geometry.GeometricalObject;

public class Triangle implements GeometricalObject {
    @Override
    public String getAreaFormula() {
        return "(1/2) * a * b";
    }
    @Override
    public String getPerimeterFormula() {
        return "a + b + c";
    }
}
