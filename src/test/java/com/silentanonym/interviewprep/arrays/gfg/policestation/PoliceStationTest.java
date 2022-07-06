package com.silentanonym.interviewprep.arrays.gfg.policestation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PoliceStationTest {

  @Test
  void solve() {
    Assertions.assertEquals(7, PoliceStation.solve(2, 1, new int[]{4, 5}));
    Assertions.assertEquals(23, PoliceStation.solve(4, 2, new int[]{10, 4, 2, 17}));
  }

  @Test
  void solve1() {
    Assertions.assertEquals(7, PoliceStation.solve1(2, 1, new int[]{4, 5}));
    Assertions.assertEquals(23, PoliceStation.solve1(4, 2, new int[]{10, 4, 2, 17}));
  }

  @Test
  void solve2() {
    Assertions.assertEquals(7, PoliceStation.solve2(2, 1, new int[]{4, 5}));
    Assertions.assertEquals(23, PoliceStation.solve2(4, 2, new int[]{10, 4, 2, 17}));
  }
}
