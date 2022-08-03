package com.silentanonym.interviewprep.arrays;

public class LargestNumberAtLeastTwiceOfOthers {

  // Runtime: 1 ms
  public int dominantIndex(int[] nums) {
    int largestNumber = Integer.MIN_VALUE, largestNumberIndex = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largestNumber) {
        largestNumber = nums[i];
        largestNumberIndex = i;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (i != largestNumberIndex && largestNumber < nums[i] * 2) {
        return -1;
      }
    }

    return largestNumberIndex;
  }
}
