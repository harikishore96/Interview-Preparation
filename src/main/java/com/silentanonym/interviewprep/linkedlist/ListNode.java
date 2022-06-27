package com.silentanonym.interviewprep.linkedlist;

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
