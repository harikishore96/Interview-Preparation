package com.silentanonym.interviewprep.arrays;

public class MinCostClimbingStairs {

  public int minCostClimbingStairs(int[] cost) {
    int[] dp = new int[cost.length + 1];
    dp[cost.length - 1] = cost[cost.length - 1];

    for(int i = cost.length - 2;i >= 0; i--) {
      dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
    }

    return Math.min(dp[0], dp[1]);
  }

  public int minCostClimbingStairs1(int[] cost) {
    int n = cost.length;
    int prev2 = 0, prev = 0;
    for(int i = 2; i <= n; i++) {
      int curri = Math.min(prev + cost[i-1], prev2 + cost[i-2]);
      prev2 = prev;
      prev = curri;
    }
    return prev;
  }
}
