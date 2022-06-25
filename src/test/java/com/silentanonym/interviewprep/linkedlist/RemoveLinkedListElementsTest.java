package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Test;

class RemoveLinkedListElementsTest {

    RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

    @Test
    void removeElements() {

        // [1,2,6,3,4,5,6], val = 6
        RemoveLinkedListElements.ListNode head = removeLinkedListElements.new ListNode(1);
        head.next(2).next(6).next(3).next(4).next(5).next(6);

        RemoveLinkedListElements.ListNode expected = removeLinkedListElements.new ListNode(1);
        expected.next(2).next(3).next(4).next(5);
        print(head);

        RemoveLinkedListElements.ListNode actual = removeLinkedListElements.removeElements(head, 6);
        print(actual);
    }

    private void print(RemoveLinkedListElements.ListNode head) {
        System.out.println("");
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }
}
