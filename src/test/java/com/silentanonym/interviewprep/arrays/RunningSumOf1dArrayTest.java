package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningSumOf1dArrayTest {

  RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();

  @Test
  void runningSum() {

    int[] nums = {1, 2, 3, 4};
    int[] expected = {1, 3, 6, 10};
    Assertions.assertArrayEquals(expected, runningSumOf1dArray.runningSum(nums));

    int[] nums1 = {1, 1, 1, 1, 1};
    int[] expected1 = {1, 2, 3, 4, 5};
    Assertions.assertArrayEquals(expected1, runningSumOf1dArray.runningSum(nums1));

    int[] nums2 = {3, 1, 2, 10, 1};
    int[] expected2 = {3, 4, 6, 16, 17};
    Assertions.assertArrayEquals(expected2, runningSumOf1dArray.runningSum(nums2));
  }
}
