package com.silentanonym.interviewprep.arrays;

public class BubbleSort {

    public void sort(int[] nums) {
        for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < nums.length - 1; innerIndex++) {
                if (nums[innerIndex] > nums[innerIndex + 1]) {
                    int temp = nums[innerIndex + 1];
                    nums[innerIndex + 1] = nums[innerIndex];
                    nums[innerIndex] = temp;
                }
            }
        }
    }
}
