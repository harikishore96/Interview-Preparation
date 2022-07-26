package com.silentanonym.interviewprep.linkedlist;

public class Palindrome {

  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }

    // Find the middle node
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // Reverse the right half
    slow = reverse(slow);

    // Check if left & right halves are equal
    fast = head;
    while (slow != null) {
      if (slow.val != fast.val) {
        return false;
      }
      slow = slow.next;
      fast = fast.next;
    }
    return true;
  }

  private ListNode reverse(ListNode slow) {
    ListNode newHead = slow;
    while (slow != null && slow.next != null) {
      ListNode temp = slow.next;
      slow.next = slow.next.next;
      temp.next = newHead;
      newHead = temp;
    }
    return newHead;
  }
}
