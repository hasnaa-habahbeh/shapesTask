package org.shapes;

public class Triangle extends Shape {
    private double base, leg1, leg2;

    public String toString() {
        String triangleString = ">> Triangle << \n";
        triangleString = triangleString.concat("Base: " + getBase() + "\n");
        triangleString = triangleString.concat("Leg1: " + getLeg1() + "\n");
        triangleString = triangleString.concat("Leg2: " + getLeg2() + "\n");
        triangleString = triangleString.concat("Area: " + calculateArea() + "\n");
        triangleString = triangleString.concat("Perimeter: " + calculatePerimeter());

        return triangleString;
    }

    public double calculateArea() {
        double semiPerimeter = (base + leg1 + leg2) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - base) * (semiPerimeter - leg1) * (semiPerimeter - leg2));
    }

    // overload method:
    public double calculateArea(double height) {
        validateValue(height, "height");
        return base * height / 2;
    }

    public double calculatePerimeter() {
        return base + leg1 + leg2;
    }

    public double getBase() {
        return this.base;
    }

    public double getLeg1() {
        return this.leg1;
    }

    public double getLeg2() {
        return this.leg2;
    }

    public void setBase(double baseInput) {
        validateValue(baseInput, "base");
        this.base = baseInput;
    }

    public void setLeg1(double leg1Input) {
        validateValue(leg1Input, "leg1");
        this.leg1 = leg1Input;
    }

    public void setLeg2(double leg2Input) {
        validateValue(leg2Input, "leg2");
        this.leg2 = leg2Input;
    }

    public static void validateValue(double value, String valueName) {
        if (value <= 0) {
            throw new IllegalArgumentException("Error: " + valueName + " should be greater than 0");
        }
    }
}
