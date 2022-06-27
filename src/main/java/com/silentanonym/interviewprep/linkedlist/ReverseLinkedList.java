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
}
