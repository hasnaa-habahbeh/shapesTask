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
    public void testToString() {
        Triangle spyTriangle = spy(testTriangle);

        when(spyTriangle.getBase()).thenReturn(5.0);
        when(spyTriangle.getLeg1()).thenReturn(5.0);
        when(spyTriangle.getLeg2()).thenReturn(5.0);
        when(spyTriangle.calculateArea()).thenReturn(6.85);
        when(spyTriangle.calculatePerimeter()).thenReturn(15.0);

        String result = spyTriangle.toString();
        String expectedResult = ">> Triangle << \nBase: 5.0\nLeg1: 5.0\nLeg2: 5.0\nArea: 6.85\nPerimeter: 15.0";

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateArea() {
        double result = testTriangle.calculateArea();

        assertEquals(24, result);
    }

    @Test
    public void testCalculateAreaByHeight() {
        double result = testTriangle.calculateArea(4);

        assertEquals(12, result);
    }

    @Test
    public void testCalculatePerimeter() {
        double result = testTriangle.calculatePerimeter();

        assertEquals(24, result);
    }

    @Test
    public void testGetBase() {
        assertEquals(6, testTriangle.getBase());
    }

    @Test
    public void testGetLeg1() {
        assertEquals(8, testTriangle.getLeg1());
    }

    @Test
    public void testGetLeg2() {
        assertEquals(10, testTriangle.getLeg2());
    }

    @Test
    public void testSetBase() {
        testTriangle.setBase(8);

        assertEquals(8, testTriangle.getBase());
    }

    @Test
    public void testSetLeg1() {
        testTriangle.setLeg1(8);

        assertEquals(8, testTriangle.getLeg1());
    }

    @Test
    public void testSetLeg2() {
        testTriangle.setLeg2(8);

        assertEquals(8, testTriangle.getLeg2());
    }

    @Test
    public void testValidateValueShouldNotThrowIfInputIsPositive() {
        assertDoesNotThrow(() -> testTriangle.validateValue(4, "testValue"));
    }

    @Test
    public void testValidateValueShouldThrowIfInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> testTriangle.validateValue(-4, "testValue"));
    }

    @Test
    public void testValidateValueShouldThrowIfInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> testTriangle.validateValue(0, "testValue"));
    }
}