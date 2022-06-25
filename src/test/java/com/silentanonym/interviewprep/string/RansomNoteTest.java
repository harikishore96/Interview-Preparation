package com.silentanonym.interviewprep.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RansomNoteTest {

    RansomNote ransomNote = new RansomNote();

    @Test
    void canConstruct() {
        Assertions.assertFalse(ransomNote.canConstruct("a", "b"));
        Assertions.assertFalse(ransomNote.canConstruct("aa", "ab"));
        Assertions.assertTrue(ransomNote.canConstruct("aa", "aab"));
    }
}
