package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    void maxSubArray() {
        assertEquals(maximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}), 6);
        assertEquals(maximumSubarray.maxSubArray(new int[] {1}), 1);
        assertEquals(maximumSubarray.maxSubArray(new int[] {5,4,-1,7,8}), 23);
    }

    @Test
    void maxSubArray1() {
        assertEquals(maximumSubarray.maxSubArray1(new int[] {-2,1,-3,4,-1,2,1,-5,4}), 6);
        assertEquals(maximumSubarray.maxSubArray1(new int[] {1}), 1);
        assertEquals(maximumSubarray.maxSubArray1(new int[] {5,4,-1,7,8}), 23);
    }
}
