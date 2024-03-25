import org.example.BinarySearchCorrection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchCorrectionTest {

    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearchCorrection.binarySearch(null, 5));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearchCorrection.binarySearch(array, 5));
    }

    @Test
    public void testElementPresent() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearchCorrection.binarySearch(array, 5));
    }

    @Test
    public void testElementAbsent() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearchCorrection.binarySearch(array, 4));
    }

    @Test
    public void testElementAtFirstIndex() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(0, BinarySearchCorrection.binarySearch(array, 2));
    }

    @Test
    public void testElementAtLastIndex() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(4, BinarySearchCorrection.binarySearch(array, 10));
    }

    @Test
    public void testElementInMiddle() {
        int[] array = {3, 6, 9, 12, 15};
        assertEquals(2, BinarySearchCorrection.binarySearch(array, 9));
    }

    @Test
    public void testElementNotPresent() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(-1, BinarySearchCorrection.binarySearch(array, 7));
    }
}
