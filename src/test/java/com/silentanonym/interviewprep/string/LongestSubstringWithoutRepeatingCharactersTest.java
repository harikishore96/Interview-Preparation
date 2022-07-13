package com.silentanonym.interviewprep.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

  LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

  @Test
  void lengthOfLongestSubstring() {
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
    Assertions.assertEquals(3, actual);

    actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
    Assertions.assertEquals(1, actual);

    actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
    Assertions.assertEquals(3, actual);

    actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("   ");
    Assertions.assertEquals(1, actual);

    actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au");
    Assertions.assertEquals(2, actual);
  }

  @Test
  void lengthOfLongestSubstring1() {
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1("abcabcbb");
    Assertions.assertEquals(3, actual);

    actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1("bbbbb");
    Assertions.assertEquals(1, actual);

    actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1("pwwkew");
    Assertions.assertEquals(3, actual);

    actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1("   ");
    Assertions.assertEquals(1, actual);

    actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1("au");
    Assertions.assertEquals(2, actual);
  }
}
