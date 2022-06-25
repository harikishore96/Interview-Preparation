package com.silentanonym.interviewprep.arrays;

public class BinarySearch {

    public int search(int[] nums, int searchElement) {
        return binarySearch(nums, searchElement, 0, nums.length - 1);
    }

    // Recursive Method
    private int binarySearch(int[] nums, int searchElement, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[low] == searchElement) return low;
            if (nums[high] == searchElement) return high;
            if (nums[mid] == searchElement) return mid;

            if (searchElement < nums[mid]) {
                // Search Left Part
                return binarySearch(nums, searchElement, low, mid - 1);
            } else {
                // Search Right Part
                return binarySearch(nums, searchElement, mid + 1, high);
            }
        }
        return -1;
    }

    public int search1(int[] nums, int searchElement) {
        return binarySearch1(nums, searchElement);
    }

    // Iterative Method
    private int binarySearch1(int[] nums, int searchElement) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] == searchElement) return low;
            if (nums[high] == searchElement) return high;
            if (nums[mid] == searchElement) return mid;

            if (searchElement < nums[mid]) {
                // Search Left Part
                high = mid - 1;
            } else {
                // Search Right Part
                low = mid + 1;
            }
        }
        return -1;
    }
}
