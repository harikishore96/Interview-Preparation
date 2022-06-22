package com.silentanonym.interviewprep.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertBinaryStringToDecimalTest {

    ConvertBinaryStringToDecimal convertBinaryStringToDecimal = new ConvertBinaryStringToDecimal();

    @Test
    void convertToDecimal() {
        Assertions.assertEquals(8, convertBinaryStringToDecimal.convertToDecimal("1000"));
        Assertions.assertEquals(15, convertBinaryStringToDecimal.convertToDecimal("1111"));
        Assertions.assertEquals(31, convertBinaryStringToDecimal.convertToDecimal("11111"));
    }
}
