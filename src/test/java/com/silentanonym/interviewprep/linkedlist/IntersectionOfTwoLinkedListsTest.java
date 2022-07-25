package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoLinkedListsTest {

  IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();

  @Test
  void getIntersectionNode() {
    ListNode expected = new ListNode(8);
    expected.next(4).next(5);
    ListNode headA = new ListNode(4);
    headA.next(1).next(expected);
    ListNode headB = new ListNode(5);
    headB.next(6).next(1).next(expected);
    ListNode actual = intersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);
    Assertions.assertEquals(expected, actual);

    headA = new ListNode(4);
    headA.next(1);
    headB = new ListNode(5);
    headB.next(6).next(1);
    actual = intersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);
    Assertions.assertNull(actual);
  }
}
