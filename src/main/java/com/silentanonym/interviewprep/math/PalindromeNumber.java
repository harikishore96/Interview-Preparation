package com.silentanonym.interviewprep.math;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;

        int num = x;
        int reverse = num % 10;
        while (num > 0) {
            num = num / 10;
            if (num != 0) reverse = reverse * 10 + num % 10;
        }
        return x == reverse;
    }
}
