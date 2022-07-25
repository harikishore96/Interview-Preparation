package com.silentanonym.interviewprep.linkedlist;

public class ReverseLinkedList {

  // head = 1 -> 2 -> 3 -> 4 -> 5 -> null
  public ListNode reverseList(ListNode head) { // Current Node
    ListNode newHead = null; // Previous Node
    while (head != null) {
      ListNode nextNode = head.next;
      head.next = newHead;
      newHead = head;
      head = nextNode;
    }
    return newHead;
  }

  /**
   * Iterate the nodes in original order and move them to the head of the list one by one
   *
   * @param head
   * @return New Head
   */
  public ListNode reverseList1(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode dummy = head;
    ListNode newHead = head;

    while (dummy != null && dummy.next != null) {
      ListNode temp = dummy.next;
      dummy.next = dummy.next.next;
      temp.next = newHead;
      newHead = temp;
    }
    return newHead;
  }
}
