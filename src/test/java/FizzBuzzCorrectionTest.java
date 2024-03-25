import org.example.FizzBuzzCorrection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzCorrectionTest {

    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzCorrection.fizzBuzz(-1));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzCorrection.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzzCorrection.fizzBuzz(45));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzzCorrection.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzzCorrection.fizzBuzz(9));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzzCorrection.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzzCorrection.fizzBuzz(20));
    }

    @Test
    public void testOtherNumbers() {
        assertEquals("1", FizzBuzzCorrection.fizzBuzz(1));
        assertEquals("8", FizzBuzzCorrection.fizzBuzz(8));
    }
}
