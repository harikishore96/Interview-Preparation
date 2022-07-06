package com.silentanonym.interviewprep.arrays;

public class RunningSumOf1dArray {

  public int[] runningSum(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    return nums;
  }
}
