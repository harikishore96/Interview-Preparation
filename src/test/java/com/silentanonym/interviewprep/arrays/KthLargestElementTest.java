package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestElementTest {

  KthLargestElement kthLargestElement = new KthLargestElement();

  @Test
  void findKthLargest() {
    Assertions.assertEquals(5, kthLargestElement.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    Assertions.assertEquals(4,
        kthLargestElement.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
  }

  @Test
  void findKthLargest1() {
    Assertions.assertEquals(5, kthLargestElement.findKthLargest1(new int[]{3, 2, 1, 5, 6, 4}, 2));
    Assertions.assertEquals(4,
        kthLargestElement.findKthLargest1(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
  }
}
