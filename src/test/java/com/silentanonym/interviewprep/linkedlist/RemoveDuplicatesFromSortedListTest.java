package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListTest {

  RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

  @Test
  void deleteDuplicates() {

    // [1, 1, 2]
    ListNode head = new ListNode(1);
    head.next(1).next(2);
    int[] expected = {1, 2};

    ListNode newHead = removeDuplicatesFromSortedList.deleteDuplicates(head);
    int[] actual = ListNode.toArray(newHead);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void deleteDuplicates1() {
    // [1, 1, 1]
    ListNode head = new ListNode(1);
    head.next(1).next(1);
    int[] expected = {1};

    ListNode newHead = removeDuplicatesFromSortedList.deleteDuplicates(head);
    print(newHead);
    int[] actual = ListNode.toArray(newHead);
    Assertions.assertArrayEquals(expected, actual);
  }

  private void print(ListNode head) {
    while (head != null) {
      System.out.print(head.val);
      head = head.next;
    }
  }
}
