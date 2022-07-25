package com.silentanonym.interviewprep.linkedlist;

public class IntersectionOfTwoLinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
    ListNode dummyA = headA;
    ListNode dummyB = headB;
    while (dummyA != dummyB) {
      dummyA = dummyA != null ? dummyA.next : headB;
      dummyB = dummyB != null ? dummyB.next : headA;
    }
    return dummyA;
  }
}
