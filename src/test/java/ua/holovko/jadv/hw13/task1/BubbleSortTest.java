package ua.holovko.jadv.hw13.task1;

import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.bubbleSort(arr);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortEmptyArray() {
        int[] arr = {};
        BubbleSort.bubbleSort(arr);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortSingleElementArray() {
        int[] arr = {42};
        BubbleSort.bubbleSort(arr);
        int[] expected = {42};
        assertArrayEquals(expected, arr);
    }
}

