package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

  Palindrome palindrome = new Palindrome();

  @Test
  void isPalindrome() {

    // Test Case 1
    ListNode head = new ListNode(1);
    head.next(2).next(2).next(1);
    Assertions.assertTrue(palindrome.isPalindrome(head));

    // Test Case 2
    head = new ListNode(1);
    head.next(2);
    Assertions.assertFalse(palindrome.isPalindrome(head));

    // Test Case 3
    head = new ListNode(1);
    Assertions.assertTrue(palindrome.isPalindrome(head));

    // Test Case 4
    head = null;
    Assertions.assertTrue(palindrome.isPalindrome(head));

    // Test Case 5
    head = new ListNode(1);
    head.next(2).next(3).next(2).next(1);
    Assertions.assertTrue(palindrome.isPalindrome(head));
  }
}
