package com.silentanonym.interviewprep.arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1;
        for(int index = m+n-1; p2 >= 0;index--) {
            if(p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1--];
            } else {
                nums1[index] = nums2[p2--];
            }
        }
    }
}
