package com.silentanonym.interviewprep.linkedlist;

public class LinkedListCycleII {

  public ListNode detectCycle(ListNode head) {
    ListNode slow = head, fast = head, entry = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        while (slow != entry) {
          slow = slow.next;
          entry = entry.next;
        }
        return entry;
      }
    }
    return null;
  }
}
