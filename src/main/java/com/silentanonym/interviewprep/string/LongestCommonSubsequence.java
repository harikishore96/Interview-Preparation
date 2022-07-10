package com.silentanonym.interviewprep.string;

public class LongestCommonSubsequence {

  public int longestCommonSubsequence(String text1, String text2) {
    int[][] dp = new int[text1.length() + 1][text2.length() + 1];

    for (int row = 1; row <= text1.length(); row++) {
      for (int col = 1; col <= text2.length(); col++) {
        if (text1.charAt(row - 1) == text2.charAt(col - 1)) {
          dp[row][col] = dp[row - 1][col - 1] + 1;
        } else {
          dp[row][col] = Math.max(dp[row - 1][col], dp[row][col - 1]);
        }
      }
    }

    return dp[dp.length - 1][dp[0].length - 1];
  }
}
