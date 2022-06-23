package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void addTwoNumbers() {

        AddTwoNumbers.ListNode l1 = addTwoNumbers.new ListNode(2);//.next(4).next(3);
        AddTwoNumbers.ListNode secondNode = addTwoNumbers.new ListNode(4);
        AddTwoNumbers.ListNode thirdNode = addTwoNumbers.new ListNode(3);
        l1.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = null;

        AddTwoNumbers.ListNode l2 = addTwoNumbers.new ListNode(5);//.next(6).next(4);
        secondNode = addTwoNumbers.new ListNode(6);
        thirdNode = addTwoNumbers.new ListNode(4);
        l2.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = null;

        AddTwoNumbers.ListNode expected = addTwoNumbers.new ListNode(7);//.next(0).next(8);
        secondNode = addTwoNumbers.new ListNode(0);
        thirdNode = addTwoNumbers.new ListNode(8);
        expected.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = null;

        print(expected);

        AddTwoNumbers.ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println("");
        print(actual);
    }

    private void print(AddTwoNumbers.ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }
}
