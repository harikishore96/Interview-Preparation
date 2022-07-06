package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTheHighestAltitudeTest {

  FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();

  @Test
  void largestAltitude() {
    Assertions.assertEquals(1, findTheHighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    Assertions.assertEquals(0,
        findTheHighestAltitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
  }
}
