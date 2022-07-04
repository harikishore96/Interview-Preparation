package com.silentanonym.interviewprep.linkedlist;

public class ConvertBinaryNumberInALinkedListToInteger {

    // num = num * 2 + x.
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }

    // num = (num << 1) | x
    public int getDecimalValue1(ListNode head) {
        int num = 0;
        while (head != null) {
            num = (num << 1) | head.val;
            head = head.next;
        }
        return num;
    }
}
