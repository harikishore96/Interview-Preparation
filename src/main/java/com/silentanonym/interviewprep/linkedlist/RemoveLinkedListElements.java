package com.silentanonym.interviewprep.linkedlist;

public class RemoveLinkedListElements {

  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0, head);
    ListNode previous = dummy, current = dummy.next;
    while (current != null) {
      if (current.val == val) {
        previous.next = current.next;
      } else {
        previous = current;
      }
      current = current.next;
    }
    return dummy.next;
  }
}
