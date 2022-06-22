package com.silentanonym.interviewprep.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterTest {

    FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();

    @Test
    void firstUniqChar() {
        Assertions.assertEquals(0, firstUniqueCharacter.firstUniqChar("leetcode"));
        Assertions.assertEquals(2, firstUniqueCharacter.firstUniqChar("loveleetcode"));
        Assertions.assertEquals(-1, firstUniqueCharacter.firstUniqChar("aabb"));
    }

    @Test
    void firstUniqChar1() {
        Assertions.assertEquals(0, firstUniqueCharacter.firstUniqChar1("leetcode"));
        Assertions.assertEquals(2, firstUniqueCharacter.firstUniqChar1("loveleetcode"));
        Assertions.assertEquals(-1, firstUniqueCharacter.firstUniqChar1("aabb"));
    }

    @Test
    void firstUniqChar2() {
        Assertions.assertEquals(0, firstUniqueCharacter.firstUniqChar2("leetcode"));
        Assertions.assertEquals(2, firstUniqueCharacter.firstUniqChar2("loveleetcode"));
        Assertions.assertEquals(-1, firstUniqueCharacter.firstUniqChar2("aabb"));
    }
}
