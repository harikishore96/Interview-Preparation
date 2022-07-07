package com.silentanonym.interviewprep.math;

public class FibonacciNumber {

  // Dynamic Programming - Iteration & Tabulation/Memoization
  // Time : O(N), Space : O(N)
  public int fib1(int n) {
    if (n <= 1) {
      return n;
    }

    int[] dp = new int[n + 1];
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  // Dynamic Programming - Iteration
  // Time : O(N), Space : O(1)
  public int fib2(int n) {
    if (n <= 1) {
      return n;
    }
    int prev2 = 0, prev = 1;
    for (int i = 2; i <= n; i++) {
      int curr = prev2 + prev;
      prev2 = prev;
      prev = curr;
    }
    return prev;
  }

  // Dynamic Programming - Recursion & Memoization
  // Time : O(N), Space : O(N*N) - N for Recursion Call stack, N for input
  public int fib(int n) {
    return fib(n, new int[31]);
  }

  private int fib(int n, int[] map) {
    if (n <= 1) {
      return n;
    }

    if (map[n] == 0) {
      map[n] = fib(n - 1, map) + fib(n - 2, map);
    }
    return map[n];
  }
}
