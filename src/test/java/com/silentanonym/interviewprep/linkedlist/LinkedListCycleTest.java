package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    void hasCycle() {

        LinkedListCycle.ListNode head = linkedListCycle.new ListNode(3);
        LinkedListCycle.ListNode secondNode = linkedListCycle.new ListNode(2);
        LinkedListCycle.ListNode thirdNode = linkedListCycle.new ListNode(0);
        LinkedListCycle.ListNode fourthNode = linkedListCycle.new ListNode(-4);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;

        Assertions.assertTrue(linkedListCycle.hasCycle(head)); // Test Case 1

        head = linkedListCycle.new ListNode(1);
        secondNode = linkedListCycle.new ListNode(2);
        head.next = secondNode;
        secondNode.next = head;

        Assertions.assertTrue(linkedListCycle.hasCycle(head)); // Test Case 2

        head = linkedListCycle.new ListNode(1);
        Assertions.assertFalse(linkedListCycle.hasCycle(head)); // Test Case 3
    }
}
