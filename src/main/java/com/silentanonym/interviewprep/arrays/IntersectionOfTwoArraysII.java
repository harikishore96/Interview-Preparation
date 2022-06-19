package com.silentanonym.interviewprep.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {

    // Array Map
    public int[] intersect2(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        int[] result = new int[1001];

        int count = 0;
        for(int num: nums1) {
            map[num]++;
        }
        for(int num: nums2) {
            if(map[num] > 0) {
                result[count++] = num;
                map[num]--;
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }

    // HashMap approach
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[1001];
        Map<Integer, Integer> map = new HashMap<>(10);
        for(int num : nums1) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for(int index=0; index < nums2.length; index++) {
            if(map.containsKey(nums2[index]) && map.get(nums2[index]) > 0) {
                result[index] = nums2[index];
                map.put(nums2[index], map.get(nums2[index]) - 1);
            }
        }
        return result;
    }

    // Two Pointer Approach
    public int[] intersect1(int[] nums1, int[] nums2) {
        int[] result = new int[1001];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0,p2=0, index=0;
        while(p1 < nums1.length && p2 < nums2.length) {
            int num1 = nums1[p1];
            int num2 = nums2[p2];
            if(num1 < num2) {
                ++p1;
            } else if(num1 > num2) {
                ++p2;
            } else {
                ++p1;
                ++p2;
                result[index] = num1;
                ++index;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
