package org.shapes;

public class Square extends Shape {
    private double side;

    public String toString() {
        String squareString = ">> Square << \n";
        squareString= squareString.concat("Side: " + getSide() + "\n");
        squareString = squareString.concat("Area: " + calculateArea() + "\n");
        squareString = squareString.concat("Perimeter: " + calculatePerimeter());

        return squareString;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double sideInput) {
        validateSide(sideInput);
        this.side = sideInput;
    }

    public void validateSide(double sideInput) {
        if (sideInput <= 0) {
            throw new IllegalArgumentException("Error: side should be greater than 0");
        }
    }
}
