package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void reverseList() {

        ListNode head = new ListNode(1);
        head.next(2).next(3).next(4).next(5);
        print(head);

        ListNode actual = reverseLinkedList.reverseList(head);
        print(actual);
    }

    private void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }
}
