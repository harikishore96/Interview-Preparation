package com.silentanonym.interviewprep.string;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    int len = 0;
    int[] map = new int[255];
    Arrays.fill(map, -1);
    int left = 0, right = 0;
    while (right < s.length()) {
      if (map[s.charAt(right)] != -1) {
        left = Math.max(map[s.charAt(right)] + 1, left);
      }
      map[s.charAt(right)] = right;
      len = Math.max(len, right - left + 1);
      right++;
    }
    return len;
  }

  public int lengthOfLongestSubstring1(String s) {
    int len = 0;
    int[] map = new int[255];
    int left = 0, right = 0;
    while (right < s.length()) {
      char character = s.charAt(right);
      left = Math.max(map[character], left);
      len = Math.max(len, right - left + 1);

      map[character] = right + 1;
      right++;
    }
    return len;
  }
}
