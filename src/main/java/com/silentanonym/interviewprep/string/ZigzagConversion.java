package com.silentanonym.interviewprep.string;

public class ZigzagConversion {

  public String convert(String s, int numRows) {
    if (numRows <= 1) {
      return s;
    }
    String zigzag = "";
    int rowNum = 0;
    while (rowNum < numRows) {
      int charIndex = rowNum;
      while (charIndex < s.length()) {
        zigzag += s.charAt(charIndex);
        charIndex += 2 * (numRows - 1);
        int middleRowIndex = charIndex - (2 * rowNum);
        if (rowNum > 0 && rowNum < numRows - 1 && middleRowIndex < s.length()) {
          zigzag += s.charAt(middleRowIndex);
        }
      }

      rowNum++;
    }
    return zigzag;
  }
}
