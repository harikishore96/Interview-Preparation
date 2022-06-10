package com.silentanonym.interviewprep.arrays;

import java.util.HashMap;

/**
 * TwoSum
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++) {
            int diff = target - nums[index];
            if(map.containsKey(diff)) {
                output[0] = map.get(diff);
                output[1] = index;
                break;
            } else {
                map.put(nums[index], index);
            }
        }
        return output;
    }
}
