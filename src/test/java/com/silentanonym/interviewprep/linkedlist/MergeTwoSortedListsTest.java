package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    void mergeTwoLists() {

        MergeTwoSortedLists.ListNode l1 = mergeTwoSortedLists.new ListNode(1);
        MergeTwoSortedLists.ListNode secondNode = mergeTwoSortedLists.new ListNode(2);
        MergeTwoSortedLists.ListNode thirdNode = mergeTwoSortedLists.new ListNode(4);
        l1.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = null;

        MergeTwoSortedLists.ListNode l2 = mergeTwoSortedLists.new ListNode(1);
        secondNode = mergeTwoSortedLists.new ListNode(3);
        thirdNode = mergeTwoSortedLists.new ListNode(4);
        l2.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = null;

        // 1,1,2,3,4,4
        MergeTwoSortedLists.ListNode expected = mergeTwoSortedLists.new ListNode(1);
        secondNode = mergeTwoSortedLists.new ListNode(1);
        thirdNode = mergeTwoSortedLists.new ListNode(2);
        MergeTwoSortedLists.ListNode node4 = mergeTwoSortedLists.new ListNode(3);
        MergeTwoSortedLists.ListNode node5 = mergeTwoSortedLists.new ListNode(4);
        MergeTwoSortedLists.ListNode node6 = mergeTwoSortedLists.new ListNode(4);
        expected.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;
        print(expected);

        MergeTwoSortedLists.ListNode actual = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        System.out.println("");
        print(actual);
    }

    private void print(MergeTwoSortedLists.ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }
}
