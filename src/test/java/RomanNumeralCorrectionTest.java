import org.example.RomanNumeralCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralCorrectionTest {

    @Test
    public void testLowerBound() {
        assertEquals("I", RomanNumeralCorrection.toRoman(1));
    }

    @Test
    public void testUpperBound() {
        assertEquals("MMMCMXCIX", RomanNumeralCorrection.toRoman(3999));
    }

    @Test
    public void testInvalidLowerBound() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralCorrection.toRoman(0));
    }

    @Test
    public void testInvalidUpperBound() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralCorrection.toRoman(4000));
    }

    @Test
    public void testRandomNumber() {
        assertEquals("MCMXC", RomanNumeralCorrection.toRoman(1990));
    }

    @Test
    public void testRandomNumber2() {
        assertEquals("CDXLIV", RomanNumeralCorrection.toRoman(444));
    }
}
