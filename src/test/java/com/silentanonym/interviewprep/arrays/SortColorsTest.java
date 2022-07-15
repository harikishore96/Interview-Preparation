package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortColorsTest {

  SortColors sortColors = new SortColors();

  @Test
  void sortColors() {

    int[] nums = {2, 0, 2, 1, 1, 0};
    sortColors.sortColors(nums);
    Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);

    nums = new int[]{2, 0, 1};
    sortColors.sortColors(nums);
    Assertions.assertArrayEquals(new int[]{0, 1, 2}, nums);
  }
}
