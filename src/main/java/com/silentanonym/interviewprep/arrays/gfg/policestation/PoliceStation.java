package com.silentanonym.interviewprep.arrays.gfg.policestation;

import java.util.Arrays;

public class PoliceStation {

  // Brute-Force
  public static int solve(int N, int a, int[] x) {
    // code here
    int maxDistance = 0;
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        if (i != j) {
          int distance = Math.abs(a - x[i]) + Math.abs(a - x[j]);
          maxDistance = Math.max(maxDistance, distance);
        }
      }
    }
    return maxDistance;
  }

  // Optimisation
  public static int solve2(int N, int a, int[] x) {
    // code here
    Arrays.sort(x);
    int maxDistance = 0;
    int[] elements = {x[0], x[1], x[N - 2], x[N - 1]};
    if (N < 4) {
      elements = x;
    }
    for (int i = 0; i < elements.length; i++) {
      for (int j = 0; j < elements.length; j++) {
        if (i != j) {
          int distance = Math.abs(a - x[i]) + Math.abs(a - x[j]);
          maxDistance = Math.max(maxDistance, distance);
        }
      }
    }
    return maxDistance;
  }

  // Two Pointers
  public static int solve1(int N, int a, int[] x) {
    // code here
    int maxDistance = 0;
    int p1 = 0, p2 = N - 1;
    Arrays.sort(x);
    while (p1 < p2) {
      int p1Distance = Math.abs(a - x[p1]);
      int p2Distance = Math.abs(a - x[p2]);
      int totalDistance = p1Distance + p2Distance;
      maxDistance = Math.max(maxDistance, totalDistance);

      if (p1Distance < p2Distance) {
        p1++;
      } else {
        p2--;
      }
    }
    return maxDistance;
  }
}
