package com.silentanonym.interviewprep.linkedlist;

public class RotateList {

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }

    // Compute the length
    int length = 1;
    ListNode dummy = head;
    while (dummy.next != null) {
      ++length;
      dummy = dummy.next;
    }

    // Circle through rotation
    dummy.next = head;
    k = length - k % length;
    while (k-- > 0) {
      dummy = dummy.next;
    }
    head = dummy.next;
    dummy.next = null;
    return head;
  }
}
