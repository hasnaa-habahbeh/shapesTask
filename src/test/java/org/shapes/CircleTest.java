package org.shapes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle testCircle = new Circle();

    @BeforeEach
    private void setUp() {
        testCircle.setRadius(3);
    }

    @Test
    public void calculateArea_ValidInput_CalculatedCircleArea() {
        double result = testCircle.calculateArea();

        assertEquals(28.26, result);
    }

    @Test
    public void calculatePerimeter_ValidInput_CalculatedCirclePerimeter() {
        double result = testCircle.calculatePerimeter();

        assertEquals(18.84, result);
    }

    @Test
    public void validateRadius_PositiveInput_ShouldNotThrow() {
        assertDoesNotThrow(() -> testCircle.validateRadius(5));
    }

    @Test
    public void validateRadius_NegativeInput_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> testCircle.validateRadius(-5));
    }

    @Test
    public void validateRadius_ZeroInput_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> testCircle.validateRadius(0));
    }
}