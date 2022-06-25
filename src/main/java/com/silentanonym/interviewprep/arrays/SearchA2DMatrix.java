package com.silentanonym.interviewprep.arrays;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int columnLength = matrix[0].length;
        for (int row = 0; row < matrix.length; row++) {
            if (target <= matrix[row][columnLength - 1]) {
                int targetIndex = binarySearch(matrix[row], target, 0, columnLength - 1);
                if (targetIndex != -1) return true;
            }
        }
        return false;
    }

    private int binarySearch(int[] nums, int searchElement, int low, int high) {
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
