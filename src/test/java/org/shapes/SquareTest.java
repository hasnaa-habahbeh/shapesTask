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
    public void testToString() {
        Square spySquare = spy(testSquare);

        when(spySquare.getSide()).thenReturn(5.0);
        when(spySquare.calculateArea()).thenReturn(25.0);
        when(spySquare.calculatePerimeter()).thenReturn(20.0);

        String result = spySquare.toString();
        String expectedResult = ">> Square << \nSide: 5.0\nArea: 25.0\nPerimeter: 20.0";

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateArea() {
        double result = testSquare.calculateArea();

        assertEquals(25, result);
    }

    @Test
    public void testCalculatePerimeter() {
        double result = testSquare.calculatePerimeter();

        assertEquals(20, result);
    }

    @Test
    public void testGetSide() {
        assertEquals(5, testSquare.getSide());
    }


    @Test
    public void testValidateSideShouldNotThrowIfInputIsPositive() {
        assertDoesNotThrow(() -> testSquare.validateSide(5));
    }

    @Test
    public void testValidateSideShouldThrowIfInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> testSquare.validateSide(-5));
    }

    @Test
    public void testValidateSideShouldThrowIfInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> testSquare.validateSide(0));
    }
}