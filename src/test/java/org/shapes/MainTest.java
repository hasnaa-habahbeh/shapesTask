package org.shapes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.PrintStream;

class MainTest {
    @Test
    public void testPrintValues() {
        PrintStream outMock = mock(PrintStream.class);
        System.setOut(outMock);
        Shape mockShape = mock(Shape.class);

        Main.printValues(mockShape);

        verify(System.out).println(mockShape);
    }

    @Test
    public void testMain() {
        PrintStream outMock = mock(PrintStream.class);
        System.setOut(outMock);
        Main.main(new String[0]);

        verify(System.out, times(4));
    }
}