package com.silentanonym.interviewprep.arrays;

public class FindPivotIndex {

  // Runtime: 2 ms
  public int pivotIndex2(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }

    int sum = 0;
    for (int index = 0; index < nums.length; index++) {
      if (sum * 2 == total - nums[index]) {
        return index;
      }
      sum += nums[index];
    }
    return -1;
  }

  // Runtime: 2 ms
  public int pivotIndex1(int[] nums) {
    if (nums.length == 0) {
      return -1;
    }

    int total = 0;
    for (int num : nums) {
      total += num;
    }

    int leftSum = 0, rightSum = 0;
    for (int index = 0; index < nums.length; index++) {
      rightSum = total - nums[index] - leftSum;
      if (leftSum == rightSum) {
        return index;
      } else {
        leftSum += nums[index];
      }
    }
    return -1;
  }

  // Runtime: 664 ms
  public int pivotIndex(int[] nums) {
    if (nums.length == 0) {
      return -1;
    }

    int leftSum = 0, rightSum = 0;
    for (int index = 0; index < nums.length; index++) {
      leftSum = sum(nums, 0, index - 1);
      rightSum = sum(nums, index + 1, nums.length - 1);
      if (leftSum == rightSum) {
        return index;
      }
    }
    return -1;
  }

  private int sum(int[] nums, int start, int end) {
    int sum = 0;
    while (start < end) {
      sum = sum + nums[start] + nums[end];
      ++start;
      --end;
    }

    if (start == end) {
      sum += nums[start];
    }
    return sum;
  }
}
