package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTheDuplicateNumberTest {

  FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();

  @Test
  void findDuplicate() {
    Assertions.assertEquals(2, findTheDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    Assertions.assertEquals(3, findTheDuplicateNumber.findDuplicate(new int[]{3, 1, 3, 4, 2}));
  }
}
