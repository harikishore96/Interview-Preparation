package com.silentanonym.interviewprep.arrays;

public class ClimbingStairs {
  public int climbStairs(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;
    int prev2 = 1, prev = 2;
    for(int i = 3;i <= n;i++) {
      int curri = prev2 + prev;
      prev2 = prev;
      prev = curri;
    }
    return prev;
  }
}
