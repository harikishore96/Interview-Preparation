package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Test;

class LinkedListCycleIITest {

  LinkedListCycleII linkedListCycleII = new LinkedListCycleII();

  @Test
  void detectCycle() {
    ListNode head = new ListNode(3);
    head.next(2).next(0).next(-4).next(head);
    System.out.println(linkedListCycleII.detectCycle(head));
  }
}
