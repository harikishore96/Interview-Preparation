package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {

  OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

  @Test
  void oddEvenList() {

    // Test Case 1
    ListNode head = new ListNode(1);
    head.next(2).next(3).next(4).next(5);
    ListNode actual = oddEvenLinkedList.oddEvenList(head);
    Assertions.assertArrayEquals(new int[]{1, 3, 5, 2, 4}, ListNode.toArray(actual));
  }
}
