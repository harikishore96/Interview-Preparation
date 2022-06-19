package com.silentanonym.interviewprep.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    void isPalindrome() {
        assertEquals(palindrome.isPalindrome("MADAM"), true);
        assertEquals(palindrome.isPalindrome("abba"), true);
        assertEquals(palindrome.isPalindrome("geeks"), false);
    }
}
