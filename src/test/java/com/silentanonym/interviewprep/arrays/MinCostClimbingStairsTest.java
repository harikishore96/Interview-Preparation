package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {

  MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

  @Test
  void minCostClimbingStairs() {
    Assertions.assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
    Assertions.assertEquals(6,
        minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }

  @Test
  void minCostClimbingStairs1() {
    Assertions.assertEquals(15,
        minCostClimbingStairs.minCostClimbingStairs1(new int[]{10, 15, 20}));
    Assertions.assertEquals(6, minCostClimbingStairs.minCostClimbingStairs1(
        new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }
}
