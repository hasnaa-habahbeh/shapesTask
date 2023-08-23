package org.shapes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CircleTest {
    private Circle testCircle = new Circle();

    @BeforeEach
    private void setUp() {
        testCircle.setRadius(3);
    }

    @Test
    public void testToString() {
        Circle spyCircle = spy(testCircle);

        when(spyCircle.getRadius()).thenReturn(5.0);
        when(spyCircle.calculateArea()).thenReturn(78.53);
        when(spyCircle.calculatePerimeter()).thenReturn(31.41);

        String result = spyCircle.toString();
        String expectedResult = ">> Circle << \nRadius: 5.0\nArea: 78.53\nPerimeter: 31.41";

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateArea() {
        double result = testCircle.calculateArea();

        assertEquals(28.26, result);
    }

    @Test
    public void testCalculatePerimeter() {
        double result = testCircle.calculatePerimeter();

        assertEquals(18.84, result);
    }

    @Test
    public void testGetRadius() {
        assertEquals(3, testCircle.getRadius());
    }

    @Test
    public void testSetRadius() {
        testCircle.setRadius(4);

        assertEquals(4, testCircle.getRadius());
    }

    @Test
    public void testValidateRadiusShouldNotThrowIfInputIsPositive() {
        assertDoesNotThrow(() -> testCircle.validateRadius(5));
    }

    @Test
    public void testValidateRadiusShouldThrowIfInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> testCircle.validateRadius(-5));
    }

    @Test
    public void testValidateRadiusShouldThrowIfInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> testCircle.validateRadius(0));
    }
}