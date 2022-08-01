package com.silentanonym.interviewprep.linkedlist;

public class FlattenAMultilevelDoublyLinkedList {

  public Node flatten(Node head) {
    if (head == null) {
      return null;
    }
    Node dummy = head;
    while (dummy != null) {
      if (dummy.child != null) {
        Node next = dummy.next;
        Node child = flatten(dummy.child);
        dummy.child = null;
        dummy.next = child;
        child.prev = dummy;
        while (child.next != null) {
          child = child.next;
        }
        child.next = next;
        if (next != null) {
          next.prev = child;
        }
        dummy = child;
      }
      dummy = dummy.next;
    }
    return head;
  }
//}

  // Definition for a Node.
  class Node {

    public int val;
    public Node prev;
    public Node next;
    public Node child;
  }
}