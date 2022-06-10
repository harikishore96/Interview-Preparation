package com.silentanonym.interviewprep.arrays;

import java.util.HashMap;

/**
 * TwoSum
 */
public class TwoSum {

    // Runtime: 8 ms
    // Memory : 45.4 MB
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

    // Runtime: 1 ms
    // Memory : 42.1 MB
    public int[] twoSumOnepassHashTable(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++) {
            int diff = target - nums[index];
            if(map.containsKey(diff)) {
                return new int[] { map.get(diff), index };
            }
            map.put(nums[index], index);
        }
        return null;
    }
}
