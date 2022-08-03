package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

  PlusOne plusOne = new PlusOne();

  @Test
  void plusOne() {
    Assertions.assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
    Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
    Assertions.assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
  }
}
