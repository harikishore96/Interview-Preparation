package com.silentanonym.interviewprep.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {

  LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

  @Test
  void longestCommonSubsequence() {
    Assertions.assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
    Assertions.assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abc", "abc"));
    Assertions.assertEquals(0, longestCommonSubsequence.longestCommonSubsequence("abc", "def"));
  }
}
