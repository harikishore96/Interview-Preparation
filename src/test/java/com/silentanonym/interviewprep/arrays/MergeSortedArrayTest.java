package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void merge() {
        mergeSortedArray.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
        mergeSortedArray.merge(new int[] {1}, 1, new int[] {}, 0);
        mergeSortedArray.merge(new int[] {0}, 0, new int[] {1}, 1);
    }
}
