package com.silentanonym.interviewprep.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZigzagConversionTest {

  ZigzagConversion zigzagConversion = new ZigzagConversion();

  @Test
  void convert() {
    String actual = zigzagConversion.convert("PAYPALISHIRING", 3);
    Assertions.assertEquals("PAHNAPLSIIGYIR", actual);

    actual = zigzagConversion.convert("PAYPALISHIRING", 4);
    Assertions.assertEquals("PINALSIGYAHRPI", actual);
  }
}
