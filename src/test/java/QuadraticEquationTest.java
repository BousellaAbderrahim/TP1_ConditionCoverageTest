import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    public void testAZero() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1));
    }

    @Test
    public void testDeltaNegative() {
        assertNull(QuadraticEquation.solve(1, 1, 1));
    }

    @Test
    public void testDeltaZero() {
        double[] expected = {-1.0};
        assertArrayEquals(expected, QuadraticEquation.solve(1, 2, 1));
    }

    @Test
    public void testDeltaPositive() {
        double[] expected = {-2.0, -3.0};
        assertArrayEquals(expected, QuadraticEquation.solve(1, 5, 6));
    }
}
