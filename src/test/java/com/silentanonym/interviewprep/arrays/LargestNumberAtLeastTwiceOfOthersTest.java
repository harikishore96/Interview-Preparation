package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestNumberAtLeastTwiceOfOthersTest {

  LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new LargestNumberAtLeastTwiceOfOthers();

  @Test
  void dominantIndex() {
    Assertions.assertEquals(1,
        largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{3, 6, 1, 0}));
    Assertions.assertEquals(-1,
        largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{1, 2, 3, 4}));
    Assertions.assertEquals(3,
        largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{0, 0, 0, 1}));
  }
}
