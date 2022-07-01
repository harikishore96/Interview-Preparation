package com.silentanonym.interviewprep.arrays;

public class MaximumUnitsOnATruck {

    // Runtime: 2ms
    public int maximumUnits1(int[][] boxTypes, int truckSize) {
        int[] bucket = new int[1001];
        int maximumUnits = 0;
        for (int[] boxType : boxTypes) bucket[boxType[1]] += boxType[0];
        for (int index = 1000; index >= 0 && truckSize > 0; index--) {
            if (bucket[index] == 0) continue;
            int load = Math.min(truckSize, bucket[index]);
            maximumUnits += (load * index);
            truckSize -= load;
        }
        return maximumUnits;
    }

    // Runtime: 43ms
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        if (truckSize == 0) return 0;
        int maximumUnits = 0;
        int remainingSpace = truckSize;
        sort(boxTypes);
        for (int index = 0; index < boxTypes.length; index++) {
            int numberOfBoxes = boxTypes[index][0];
            int numberOfUnitsPerBox = boxTypes[index][1];
            maximumUnits += (Math.min(remainingSpace, numberOfBoxes) * numberOfUnitsPerBox);
            remainingSpace = remainingSpace - numberOfBoxes;
            if (remainingSpace <= 0) break;
        }
        return maximumUnits;
    }

    public void sort(int[][] nums) {
        mergeSort(nums, nums.length);
    }

    private void mergeSort(int[][] nums, int length) {
        if (length < 2) return;

        int mid = length / 2;
        int[][] left = new int[mid][2];
        int[][] right = new int[length - mid][2];

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

    private void merge(int[][] nums, int[][] left, int[][] right, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i][1] >= right[j][1]) {
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
