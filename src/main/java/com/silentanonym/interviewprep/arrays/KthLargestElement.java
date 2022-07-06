package com.silentanonym.interviewprep.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length - k];
  }

  // Priority Queue
  public int findKthLargest1(int[] nums, int k) {
    PriorityQueue<Integer> pr = new PriorityQueue<>();
    for (int num : nums) {
      pr.add(num);
      if (pr.size() > k) {
        pr.poll();
      }
    }
    return pr.poll();
  }
}
