package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

  ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

  @Test
  void reverseList() {

    ListNode head = new ListNode(1);
    head.next(2).next(3).next(4).next(5);
    ListNode actual = reverseLinkedList.reverseList(head);
    Assertions.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNode.toArray(actual));
  }

  @Test
  void reverseList1() {

    // Test Case 1
    ListNode head = new ListNode(1);
    head.next(2).next(3).next(4).next(5);
    ListNode actual = reverseLinkedList.reverseList1(head);
    Assertions.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNode.toArray(actual));

    // Test Case 2
    head = new ListNode(1);
    head.next(2);
    actual = reverseLinkedList.reverseList1(head);
    Assertions.assertArrayEquals(new int[]{2, 1}, ListNode.toArray(actual));

    // Test Case 3
    head = null;
    actual = reverseLinkedList.reverseList1(head);
    Assertions.assertArrayEquals(new int[]{}, ListNode.toArray(actual));
  }
}
