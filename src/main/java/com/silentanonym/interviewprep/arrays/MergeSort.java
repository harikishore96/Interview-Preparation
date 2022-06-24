package com.silentanonym.interviewprep.arrays;

public class MergeSort {

    /**
     * In-place Merge Sort
     * Time  : O(nLogn)
     * Space : O(n)
     *
     * @param nums
     */
    public void sort(int[] nums) {
        mergeSort(nums, nums.length);
    }

    private void mergeSort(int[] nums, int length) {
        if (length < 2) return;

        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int index = 0; index < mid; index++) {
            left[index] = nums[index];
        }
        for (int index = mid; index < length; index++) {
            right[index - mid] = nums[index];
        }
        mergeSort(left, mid);
        mergeSort(right, length - mid);
        merge(nums, left, right, mid, length - mid);
    }

    private void merge(int[] nums, int[] left, int[] right, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }
        while (i < leftLength) {
            nums[k++] = left[i++];
        }
        while (j < rightLength) {
            nums[k++] = right[j++];
        }
    }
}
