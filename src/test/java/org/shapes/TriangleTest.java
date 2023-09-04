package org.shapes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TriangleTest {

    private Triangle testTriangle;

    @BeforeEach
    private void setUp() {
        testTriangle = new Triangle();
        testTriangle.setBase(6);
        testTriangle.setLeg1(8);
        testTriangle.setLeg2(10);
    }

    @Test
    public void calculateArea_ValidInput_CalculatedTriangleArea() {
        double result = testTriangle.calculateArea();

        assertEquals(24, result);
    }

    @Test
    public void calculateArea_HeightIsProvided_CalculatedTriangleArea() {
        double result = testTriangle.calculateArea(4);

        assertEquals(12, result);
    }

    @Test
    public void calculatePerimeter_ValidInput_CalculatedTrianglePerimeter() {
        double result = testTriangle.calculatePerimeter();

        assertEquals(24, result);
    }

    @Test
    public void validateValue_PositiveInput_ShouldNotThrow() {
        assertDoesNotThrow(() -> testTriangle.validateValue(4, "testValue"));
    }

    @Test
    public void validateValue_NegativeInput_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> testTriangle.validateValue(-4, "testValue"));
    }

    @Test
    public void validateValue_ZeroInput_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> testTriangle.validateValue(0, "testValue"));
    }
}