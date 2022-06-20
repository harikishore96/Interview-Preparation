package com.silentanonym.interviewprep.arrays;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;

        for (int decimal = (int)Math.pow(2, n); decimal < (int)Math.pow(2, n + 1); decimal++) {
            // Generate bitmask
            String bitmask = Integer.toBinaryString(decimal).substring(1);

            // append subset corresponding to that bitmask
            List<Integer> curr = new ArrayList<>();
            for (int bitmaskIndex = 0; bitmaskIndex < n; ++bitmaskIndex) {
                if (bitmask.charAt(bitmaskIndex) == '1') curr.add(nums[bitmaskIndex]);
            }
            output.add(curr);
        }
        return output;
    }
}
