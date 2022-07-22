package com.silentanonym.interviewprep.linkedlist;

public class ListNode {

  int val;
  int size;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
    ++size;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public ListNode next(int val) {
    this.next = new ListNode(val);
    ++size;
    return this.next;
  }

  public ListNode next(ListNode node) {
    this.next = node;
    ++size;
    return this.next;
  }

  public static int[] toArray(ListNode head, int size) {
    ListNode dummy = head;
    int[] array = new int[size];
    for (int index = 0; index < size; index++) {
      array[index] = dummy.val;
      dummy = dummy.next;
    }
    return array;
  }

  @Override
  public String toString() {
    return "" + val;
  }
}
