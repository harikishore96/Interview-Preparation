package com.silentanonym.interviewprep.arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int num : nums) {
            sum += num;
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(sum < 0) sum = 0;
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
