package com.silentanonym.interviewprep.string;

public class ConvertBinaryStringToDecimal {

    // "1111" = 2^3 + 2^2 + 2^1 + 2^0
    // "1000" = binaryString[0] * 2^3 + binaryString[1] * 2^2 + binaryString[2] * 2^1 + binaryString[3] * 2^0
    public int convertToDecimal(String binaryString) {
        int result = 0;
        int bitPosition = binaryString.length() - 1;
        for (int index = 0; index < binaryString.length(); index++) {
            result += Integer.parseInt(String.valueOf(binaryString.charAt(index))) * Math.pow(2, bitPosition);
            --bitPosition;
        }
        return result;
    }
}
