package com.silentanonym.interviewprep.linkedlist;

public class RemoveLinkedListElements {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode next(int val) {
            this.next = new ListNode(val);
            return this.next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode previous = dummy, current = dummy.next;
        while (current != null) {
            if (current.val == val) previous.next = current.next;
            else previous = current;
            current = current.next;
        }
        return dummy.next;
    }
}
