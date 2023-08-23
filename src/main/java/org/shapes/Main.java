package org.shapes;

public class Main {
    public static void printValues(Shape shape) {
        System.out.println(shape);
    }

    public static void main(String[] args) {
        try {
            Circle testCircle = new Circle();
            testCircle.setRadius(3);
            printValues(testCircle);

            Square testSquare = new Square();
            testSquare.setSide(3);
            printValues(testSquare);

            Triangle testTriangle = new Triangle();
            testTriangle.setBase(4);
            testTriangle.setLeg1(3);
            testTriangle.setLeg2(6);
            printValues(testTriangle);

            double triangleAreaByHeight = testTriangle.calculateArea(3);
            System.out.println("overload method result -> " + triangleAreaByHeight);
        } catch (Error error) {
            System.out.println("Error: " + error);
        }
    }
}
