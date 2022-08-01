package com.silentanonym.interviewprep.linkedlist;

import java.util.ArrayList;
import java.util.List;

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

  public static int[] toArray(ListNode head) {
    ListNode dummy = head;
    List<Integer> array = new ArrayList<>(0);
    while (dummy != null) {
      array.add(dummy.val);
      dummy = dummy.next;
    }
    int[] result = new int[array.size()];
    for (int index = 0; index < array.size(); index++) {
      result[index] = array.get(index);
    }
    return result;
  }

  @Override
  public String toString() {
    return "" + val;
  }
}
