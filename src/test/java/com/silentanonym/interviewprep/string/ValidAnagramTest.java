package com.silentanonym.interviewprep.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void isAnagram() {
        Assertions.assertEquals(true, validAnagram.isAnagram("anagram", "nagaram"));
        Assertions.assertEquals(false, validAnagram.isAnagram("rat", "car"));
        Assertions.assertEquals(true, validAnagram.isAnagram1("anagram", "nagaram"));
        Assertions.assertEquals(false, validAnagram.isAnagram1("rat", "car"));
    }
}
