package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndOfListTest {

  RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

  @Test
  void removeNthFromEnd() {

    // Test Case 1
    ListNode head = new ListNode(1);
    head.next(2).next(3).next(4).next(5);
    ListNode actual = removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 5}, ListNode.toArray(actual));

    // Test Case 2
    head = new ListNode(1);
    actual = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);
    Assertions.assertArrayEquals(new int[]{}, ListNode.toArray(actual));

    // Test Case 3
    head = new ListNode(1);
    head.next(2);
    actual = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);
    Assertions.assertArrayEquals(new int[]{1}, ListNode.toArray(actual));
  }
}
