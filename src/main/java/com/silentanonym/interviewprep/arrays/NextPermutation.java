package com.silentanonym.interviewprep.arrays;

public class NextPermutation {

  public void nextPermutation(int[] nums) { // nums = [1,1,5,4,1]

    // Step 1: Find the index from backwards, where the number starts to decrease
    int i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }

    // Step 2: Swap that number with the next larger number
    if (i >= 0) {
      int j = nums.length - 1;
      while (j >= 0 && nums[j] <= nums[i]) {
        j--;
      }
      swap(nums, i, j);// nums = [1,4,5,1,1]
    }

    // Step 3: Reverse the rest numbers
    reverse(nums, i + 1);
  }

  private void reverse(int[] nums, int start) {
    int end = nums.length - 1;
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
