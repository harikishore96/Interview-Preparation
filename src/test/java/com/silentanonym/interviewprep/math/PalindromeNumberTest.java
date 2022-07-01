package com.silentanonym.interviewprep.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void isPalindrome() {
        Assertions.assertTrue(palindromeNumber.isPalindrome(121));
    }
}
