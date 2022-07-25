package com.silentanonym.interviewprep.linkedlist;

public class OddEvenLinkedList {

  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null || head.next.next == null) {
      return head;
    }
    ListNode odd = head;
    ListNode oddHead = head;
    ListNode even = head.next;
    ListNode evenHead = head.next;
    while (even != null && even.next != null) {
      odd.next = odd.next.next;
      even.next = even.next.next;
      odd = odd.next;
      even = even.next;
    }
    odd.next = evenHead;
    return head;
  }
}
