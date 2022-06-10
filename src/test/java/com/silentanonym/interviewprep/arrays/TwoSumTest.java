package com.silentanonym.interviewprep.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    void testTwoSum() {
        int[] actual = twoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        assertArrayEquals(new int[] { 0, 1 }, actual);

        actual = twoSum.twoSum(new int[] { 3, 2, 4 }, 6);
        assertArrayEquals(new int[] { 1, 2 }, actual);

        actual = twoSum.twoSum(new int[] { 3, 3 }, 6);
        assertArrayEquals(new int[] { 0, 1 }, actual);
    }

    @Test
    void testTwoSumOnepassHashTable() {
        int[] actual = twoSum.twoSumOnepassHashTable(new int[] { 2, 7, 11, 15 }, 9);
        assertArrayEquals(new int[] { 0, 1 }, actual);

        actual = twoSum.twoSumOnepassHashTable(new int[] { 3, 2, 4 }, 6);
        assertArrayEquals(new int[] { 1, 2 }, actual);

        actual = twoSum.twoSumOnepassHashTable(new int[] { 3, 3 }, 6);
        assertArrayEquals(new int[] { 0, 1 }, actual);
    }
}
