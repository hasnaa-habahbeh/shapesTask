package org.shapes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SquareTest {
    private Square testSquare = new Square();

    @BeforeEach
    private void setUp() {
        testSquare.setSide(5);
    }

    @Test
    public void calculateArea_ValidInput_CalculatedSquareArea() {
        double result = testSquare.calculateArea();

        assertEquals(25, result);
    }

    @Test
    public void calculatePerimeter_ValidInput_CalculatedSquarePerimeter() {
        double result = testSquare.calculatePerimeter();

        assertEquals(20, result);
    }

    @Test
    public void validateSide_PositiveInput_ShouldNotThrow() {
        assertDoesNotThrow(() -> testSquare.validateSide(5));
    }

    @Test
    public void validateSide_NegativeInput_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> testSquare.validateSide(-5));
    }

    @Test
    public void validateSide_ZeroInput_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> testSquare.validateSide(0));
    }
}