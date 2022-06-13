package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void testAddTwoNumbers() {

        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8]
        // Explanation: 342 + 465 = 807.

        // L1
        ListNode headNodeL1 = new ListNode(2);
        headNodeL1.next = new ListNode(4);
        headNodeL1 = headNodeL1.next;
        headNodeL1.next = new ListNode(3);
        headNodeL1 = headNodeL1.next;

        // L2
        ListNode headNodeL2 = new ListNode(5);
        headNodeL2.next = new ListNode(6);
        headNodeL2 = headNodeL2.next;
        headNodeL2.next = new ListNode(4);
        headNodeL2 = headNodeL2.next;
        addTwoNumbers.addTwoNumbers(l1, l2);
    }
}
