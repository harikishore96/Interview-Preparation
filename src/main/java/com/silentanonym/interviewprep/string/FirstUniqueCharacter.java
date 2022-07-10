package com.silentanonym.interviewprep.string;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for (char character : s.toCharArray()) ++map[character - 'a'];
        int index = 0;
        for (char character : s.toCharArray()) {
            if (map[character - 'a'] == 1) {
                return index;
            }
            ++index;
        }
        return -1;
    }

    // Runtime: 2 ms
    public int firstUniqChar1(String s) {
        int minIndex = Integer.MAX_VALUE;
        for (char character = 'a'; character <= 'z'; character++) {
            int index = s.indexOf(character);
            if (index != -1 && index == s.lastIndexOf(character)) {
                minIndex = Math.min(minIndex, index);
            }
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }

    // Runtime: 1 ms
    public int firstUniqChar2(String s) {
        int minIndex = s.length();
        for (char character = 'a'; character <= 'z'; character++) {
            int index = s.indexOf(character);
            if (index != -1 && index == s.lastIndexOf(character)) {
                minIndex = Math.min(minIndex, index);
            }
        }
        return minIndex == s.length() ? -1 : minIndex;
    }
}
