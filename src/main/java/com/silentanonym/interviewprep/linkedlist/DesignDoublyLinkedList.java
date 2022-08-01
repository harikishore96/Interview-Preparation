package com.silentanonym.interviewprep.linkedlist;

public class DesignDoublyLinkedList {

}


class DoublyLinkedList {

  private DoublyLinkedListNode head, tail;
  private int size;

  public DoublyLinkedListNode getHead() {
    return this.head;
  }

  public DoublyLinkedListNode getTail() {
    return this.tail;
  }

  public DoublyLinkedList() {
    head = new DoublyLinkedListNode();
    tail = head;
    size = 0;
  }

  public int get(int index) {
    if (index < 0 || index >= this.size) {
      return -1;
    }
    DoublyLinkedListNode dummy = this.head;
    for (int iIndex = 0; iIndex <= index; iIndex++) {
      dummy = dummy.next;
    }
    return dummy.data;
  }

  public void addAtHead(int val) {
    addAtIndex(0, val);
  }

  public void addAtTail(int val) {
    addAtIndex(size, val);
  }

  public void addAtIndex(int index, int val) {
    if (index < 0 || index > this.size) {
      return;
    }
    DoublyLinkedListNode curr = new DoublyLinkedListNode(val);
    DoublyLinkedListNode dummy = this.head;
    for (int iIndex = 0; iIndex < index; iIndex++) {
      dummy = dummy.next;
    }

    // Step 1
    curr.prev = dummy;
    curr.next = dummy.next;

    // Step 2
    dummy.next = curr;
    if (curr.next != null) {
      curr.next.prev = curr;
    } else {
      this.tail = curr;
    }
    ++this.size;
  }

  public void deleteAtIndex(int index) {
    if (index < 0 || index >= this.size) {
      return;
    }
    DoublyLinkedListNode dummy = this.head;
    for (int iIndex = 0; iIndex < index; iIndex++) {
      dummy = dummy.next;
    }

    // Step 1
    if (dummy.next != null) {
      dummy.next = dummy.next.next;
    }

    // Step 2
    if (dummy.next != null) {
      dummy.next.prev = dummy;
    } else {
      this.tail = dummy;
    }

    --this.size;
  }
}

class DoublyLinkedListNode {

  public int data;
  public DoublyLinkedListNode prev, next;

  public DoublyLinkedListNode() {
    this.data = -1;
  }

  public DoublyLinkedListNode(int data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "DoublyLinkedListNode{" +
        "prev=" + (prev != null ? String.valueOf(prev.data) : "null") +
        ", data=" + data +
        ", next=" + (next != null ? String.valueOf(next.data) : "null") +
        '}';
  }
}
