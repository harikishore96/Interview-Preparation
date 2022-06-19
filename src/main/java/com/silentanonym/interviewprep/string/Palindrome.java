package com.silentanonym.interviewprep.string;

public class Palindrome {

    // Two Pointer
    public boolean isPalindrome(String testString) {
        int p1=0,p2=testString.length()-1;
        while(p1 < p2) {
            if(testString.charAt(p1++) != testString.charAt(p2--)) {
                return false;
            }
        }
        return true;
    }
}
