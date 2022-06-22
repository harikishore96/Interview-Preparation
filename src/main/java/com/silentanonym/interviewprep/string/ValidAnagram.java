package com.silentanonym.interviewprep.string;

import java.util.Arrays;

public class ValidAnagram {

    // Time: O(NlogN)
    // Space: O(N)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    // Time: O(N)
    // Space: O(1)
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];

        for (char character : s.toCharArray()) ++count[character - 'a'];

        for (char character : t.toCharArray()) {
            if (count[character - 'a'] == 0) return false;
            --count[character - 'a'];
        }
        return true;
    }
}
