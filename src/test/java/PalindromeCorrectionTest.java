import org.example.PalindromeCorrection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCorrectionTest {

    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> PalindromeCorrection.isPalindrome(null));
    }

    @Test
    public void testEmptyString() {
        assertTrue(PalindromeCorrection.isPalindrome(""));
    }

    @Test
    public void testPalindromeString() {
        assertTrue(PalindromeCorrection.isPalindrome("level"));
    }

    @Test
    public void testNonPalindromeString() {
        assertFalse(PalindromeCorrection.isPalindrome("hello"));
    }
}
