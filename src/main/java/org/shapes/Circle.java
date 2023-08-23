package org.shapes;

public class Circle extends Shape {
    private double radius;

    public String toString() {
        String circleString = ">> Circle << \n";
        circleString = circleString.concat("Radius: " + getRadius() + "\n");
        circleString = circleString.concat("Area: " + calculateArea() + "\n");
        circleString = circleString.concat("Perimeter: " + calculatePerimeter());

        return circleString;
    }

    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radiusInput) {
        validateRadius(radiusInput);
        this.radius = radiusInput;
    }

    public void validateRadius(double radiusInput) {
        if (radiusInput <= 0) {
            throw new IllegalArgumentException("Error: radius should be greater than 0");
        }
    }
}
