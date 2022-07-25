package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveLinkedListElementsTest {

  RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

  @Test
  void removeElements() {

    // Test Case 1
    ListNode head = new ListNode(1);
    head.next(2).next(6).next(3).next(4).next(5).next(6);
    ListNode actual = removeLinkedListElements.removeElements(head, 6);
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ListNode.toArray(actual));

    // Test Case 2
    head = null;
    actual = removeLinkedListElements.removeElements(head, 1);
    Assertions.assertArrayEquals(new int[]{}, ListNode.toArray(actual));

    // Test Case 3
    head = new ListNode(7);
    head.next(7).next(7).next(7);
    actual = removeLinkedListElements.removeElements(head, 7);
    Assertions.assertArrayEquals(new int[]{}, ListNode.toArray(actual));
  }
}
