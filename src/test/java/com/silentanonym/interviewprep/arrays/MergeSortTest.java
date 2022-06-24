package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    MergeSort mergeSort = new MergeSort();

    @Test
    void sort() {
        int[] expected = new int[]{1, 5, 8, 9, 10, 12};
        int[] actual = new int[]{10, 1, 5, 12, 9, 8};
//        System.out.println(Arrays.toString(actual));
        mergeSort.sort(actual);
//        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected, actual);
    }
}
