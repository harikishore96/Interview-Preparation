package com.silentanonym.interviewprep.linkedlist;

public class RemoveNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode();
    dummy.next = head;
    ListNode slow = dummy;
    ListNode fast = dummy;
    for (int i = 1; i <= n; ++i) {
      fast = fast.next;
    }

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
  }
}
