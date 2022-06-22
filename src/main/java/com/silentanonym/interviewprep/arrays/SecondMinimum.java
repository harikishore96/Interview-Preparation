package com.silentanonym.interviewprep.arrays;

public class SecondMinimum {

    public int secondMinimum(int[] nums) {
        int min = nums[0];
        int secondMin = nums[0];

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < min) {
                secondMin = min;
                min = nums[index];
            } else if (nums[index] < secondMin) {
                secondMin = nums[index];
            }
        }
        return secondMin;
    }
}
