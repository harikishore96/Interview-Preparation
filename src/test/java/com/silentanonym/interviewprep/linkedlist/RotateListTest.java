package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateListTest {

  RotateList rotateList = new RotateList();

  @Test
  void rotateRight() {
    ListNode head = new ListNode(1);
    head.next(2).next(3).next(4).next(5);
    ListNode actual = rotateList.rotateRight(head, 2);
    Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3}, ListNode.toArray(actual));
  }
}
