
import org.example.AnagramCorrection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramCorrectionTest {

    @Test
    public void testNullStrings() {
        assertThrows(NullPointerException.class, () -> AnagramCorrection.isAnagram(null, null));
    }

    @Test
    public void testDifferentLengthStrings() {
        assertFalse(AnagramCorrection.isAnagram("hello", "world"));
    }

    @Test
    public void testAnagramStrings() {
        assertTrue(AnagramCorrection.isAnagram("listen", "silent"));
    }

    @Test
    public void testNonAnagramStrings() {
        assertFalse(AnagramCorrection.isAnagram("hello", "hell"));
    }

    @Test
    public void testAnagramWithSpaces() {
        assertTrue(AnagramCorrection.isAnagram("dormitory", "dirty room"));
    }
}