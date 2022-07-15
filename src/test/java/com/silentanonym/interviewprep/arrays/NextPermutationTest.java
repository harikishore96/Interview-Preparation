package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NextPermutationTest {

  NextPermutation nextPermutation = new NextPermutation();

  @Test
  void nextPermutation() {
    int[] nums = {1, 2, 3};
    nextPermutation.nextPermutation(nums);
    Assertions.assertArrayEquals(new int[]{1, 3, 2}, nums);

    nums = new int[]{3, 2, 1};
    nextPermutation.nextPermutation(nums);
    Assertions.assertArrayEquals(new int[]{1, 2, 3}, nums);

    nums = new int[]{1, 1, 5};
    nextPermutation.nextPermutation(nums);
    Assertions.assertArrayEquals(new int[]{1, 5, 1}, nums);
  }
}
