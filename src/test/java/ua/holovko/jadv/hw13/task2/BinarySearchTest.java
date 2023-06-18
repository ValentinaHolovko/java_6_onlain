package ua.holovko.jadv.hw13.task2;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearchElementPresent() {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int expected = 3;
        int result = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchElementNotPresent() {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 5;
        int expected = -1;
        int result = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        int target = 10;
        int expected = -1;
        int result = BinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }
}
