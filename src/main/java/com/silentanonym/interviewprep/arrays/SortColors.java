package com.silentanonym.interviewprep.arrays;

public class SortColors {

  public void sortColors(int[] nums) {
//    mergeSort(nums, nums.length);
    int[] count = new int[3];
    for (int i = 0; i < nums.length; i++) {
      ++count[nums[i]];
    }

    int k = 0;
    for (int i = 0; i < count.length; i++) {
      for (int j = 1; j <= count[i]; j++) {
        nums[k++] = i;
      }
    }
  }
}
