package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    void search() {
        Assertions.assertEquals(1, binarySearch.search(new int[]{1, 3, 5, 7, 10, 11, 16, 20}, 3));
        Assertions.assertEquals(6, binarySearch.search(new int[]{1, 3, 5, 7, 10, 11, 16, 20}, 16));
        Assertions.assertEquals(-1, binarySearch.search(new int[]{1, 3, 5, 7, 10, 11, 16, 20}, 21));
        Assertions.assertEquals(0, binarySearch.search(new int[]{1}, 1));
        Assertions.assertEquals(-1, binarySearch.search(new int[]{1}, 2));
    }

    @Test
    void search1() {
        Assertions.assertEquals(1, binarySearch.search1(new int[]{1, 3, 5, 7, 10, 11, 16, 20}, 3));
        Assertions.assertEquals(6, binarySearch.search1(new int[]{1, 3, 5, 7, 10, 11, 16, 20}, 16));
        Assertions.assertEquals(-1, binarySearch.search1(new int[]{1, 3, 5, 7, 10, 11, 16, 20}, 21));
        Assertions.assertEquals(0, binarySearch.search1(new int[]{1}, 1));
        Assertions.assertEquals(-1, binarySearch.search1(new int[]{1}, 2));
    }
}
