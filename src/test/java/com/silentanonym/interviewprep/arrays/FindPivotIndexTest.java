package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPivotIndexTest {

  FindPivotIndex findPivotIndex = new FindPivotIndex();

  @Test
  void pivotIndex() {
    Assertions.assertEquals(3, findPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    Assertions.assertEquals(-1, findPivotIndex.pivotIndex(new int[]{1, 2, 3}));
    Assertions.assertEquals(0, findPivotIndex.pivotIndex(new int[]{2, 1, -1}));
    Assertions.assertEquals(5, findPivotIndex.pivotIndex(new int[]{-1, -1, 0, 1, 1, 0}));
  }

  @Test
  void pivotIndex1() {
    Assertions.assertEquals(3, findPivotIndex.pivotIndex1(new int[]{1, 7, 3, 6, 5, 6}));
    Assertions.assertEquals(-1, findPivotIndex.pivotIndex1(new int[]{1, 2, 3}));
    Assertions.assertEquals(0, findPivotIndex.pivotIndex1(new int[]{2, 1, -1}));
    Assertions.assertEquals(5, findPivotIndex.pivotIndex1(new int[]{-1, -1, 0, 1, 1, 0}));
  }

  @Test
  void pivotIndex2() {
    Assertions.assertEquals(3, findPivotIndex.pivotIndex2(new int[]{1, 7, 3, 6, 5, 6}));
    Assertions.assertEquals(-1, findPivotIndex.pivotIndex2(new int[]{1, 2, 3}));
    Assertions.assertEquals(0, findPivotIndex.pivotIndex2(new int[]{2, 1, -1}));
    Assertions.assertEquals(5, findPivotIndex.pivotIndex2(new int[]{-1, -1, 0, 1, 1, 0}));
  }
}
