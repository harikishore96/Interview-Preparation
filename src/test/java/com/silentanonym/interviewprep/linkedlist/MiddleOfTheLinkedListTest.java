package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MiddleOfTheLinkedListTest {

  MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

  @Test
  void middleNode() {

    // Test Case 1
    ListNode head = new ListNode(1);
    head.next(2).next(3).next(4).next(5);
    ListNode actual = middleOfTheLinkedList.middleNode(head);
    Assertions.assertArrayEquals(new int[]{3, 4, 5}, ListNode.toArray(actual));

    // Test Case 2
    head = new ListNode(1);
    head.next(2).next(3).next(4).next(5).next(6);
    actual = middleOfTheLinkedList.middleNode(head);
    Assertions.assertArrayEquals(new int[]{4, 5, 6}, ListNode.toArray(actual));

    // Test Case 3
    head = null;
    actual = middleOfTheLinkedList.middleNode(head);
    Assertions.assertArrayEquals(new int[]{}, ListNode.toArray(actual));

    // Test Case 4
    head = new ListNode(1);
    actual = middleOfTheLinkedList.middleNode(head);
    Assertions.assertArrayEquals(new int[]{1}, ListNode.toArray(actual));

    // Test Case 5
    head = new ListNode(1);
    head.next(2);
    actual = middleOfTheLinkedList.middleNode(head);
    Assertions.assertArrayEquals(new int[]{2}, ListNode.toArray(actual));

    // Test Case 6
    head = new ListNode(1);
    head.next(2).next(3);
    actual = middleOfTheLinkedList.middleNode(head);
    Assertions.assertArrayEquals(new int[]{2, 3}, ListNode.toArray(actual));
  }
}
