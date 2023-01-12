package com.silentanonym.interviewprep.arrays;

public class MissingNumber {

    // Arithmetic Progression
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        for(int num : nums) {
            sum1 += num;
        }
        int n = nums.length;
        int sum2 = (n * (n + 1)) / 2;
        return sum2 - sum1;
    }

    // XOR Bit Manipulation
    public int missingNumber1(int[] nums) {
        int xorAll = nums.length;
        for(int i = 0;i < nums.length;i++) {
            xorAll ^= i ^ nums[i];
        }
        return xorAll;
    }
}