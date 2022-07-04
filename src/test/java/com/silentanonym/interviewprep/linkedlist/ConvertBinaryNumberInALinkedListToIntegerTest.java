package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertBinaryNumberInALinkedListToIntegerTest {

    ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger();

    @Test
    void getDecimalValue() {
        ListNode head = new ListNode(1);
        head.next(0).next(1);
        Assertions.assertEquals(5, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));
    }

    @Test
    void getDecimalValue1() {
        ListNode head = new ListNode(1);
        head.next(0).next(1);
        Assertions.assertEquals(5, convertBinaryNumberInALinkedListToInteger.getDecimalValue1(head));
    }
}
