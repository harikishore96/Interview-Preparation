package com.silentanonym.interviewprep.string;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        int[] count = new int[26];

        for (char character : magazine.toCharArray()) ++count[character - 'a'];

        for (char character : ransomNote.toCharArray()) {
            if (count[character - 'a'] == 0) return false;
            --count[character - 'a'];
        }
        return true;
    }
}
