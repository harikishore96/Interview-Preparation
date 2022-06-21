package com.silentanonym.interviewprep.arrays;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {

    // Two Pointer
    public int minMoves2(int[] nums) {

        // Sort
        Arrays.sort(nums);

        int minMoves = 0;
        int p1 = 0, p2 = nums.length - 1;
        while (p1 < p2) {
            minMoves += nums[p2] - nums[p1];
            ++p1;
            --p2;
        }
        return minMoves;
    }
}
