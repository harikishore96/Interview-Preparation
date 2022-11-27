package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

  ClimbingStairs climbingStairs = new ClimbingStairs();

  @Test
  void climbStairs() {
    Assertions.assertEquals(2, climbingStairs.climbStairs(2));
    Assertions.assertEquals(3, climbingStairs.climbStairs(3));
    Assertions.assertEquals(5, climbingStairs.climbStairs(4));
    Assertions.assertEquals(8, climbingStairs.climbStairs(5));
    Assertions.assertEquals(13, climbingStairs.climbStairs(6));
  }
}
