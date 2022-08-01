package com.silentanonym.interviewprep.linkedlist;

/**
 * 707. Design Linked List https://leetcode.com/problems/design-linked-list/
 */
public class DesignLinkedList {

}

class SinglyLinkedList {

  private SinglyLinkedListNode head;
  private int size;

  public SinglyLinkedListNode getHead() {
    return this.head;
  }

  public int size() {
    return this.size;
  }

  public SinglyLinkedList() {
    head = null;
    size = 0;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    SinglyLinkedListNode dummy = head;
    for (int iIndex = 0; iIndex < index; iIndex++) {
      dummy = dummy.next;
    }
    return dummy.data;
  }

  public void addAtHead(int val) {
    SinglyLinkedListNode curr = new SinglyLinkedListNode(val);
    if (head != null) {
      curr.next = head;
    }
    head = curr;
    ++size;
  }

  public void addAtTail(int val) {
    SinglyLinkedListNode curr = new SinglyLinkedListNode(val);
    if (head == null) {
      head = curr;
    } else {
      SinglyLinkedListNode dummy = head;
      while (dummy != null && dummy.next != null) {
        dummy = dummy.next;
      }
      dummy.next = curr;
    }
    ++size;
  }

  public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) {
      return;
    }

    if (head == null || index == 0) {
      addAtHead(val);
    } else {
      SinglyLinkedListNode curr = new SinglyLinkedListNode(val);
      SinglyLinkedListNode dummy = head;
      for (int iIndex = 0; iIndex < index - 1; ++iIndex) {
        dummy = dummy.next;
      }
      curr.next = dummy.next;
      dummy.next = curr;
      ++size;
    }
  }

  public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
      return;
    }
    if (index == 0) {
      head = head.next;
    } else {
      SinglyLinkedListNode dummy = head;
      for (int iIndex = 0; iIndex < index - 1; ++iIndex) {
        dummy = dummy.next;
      }
      SinglyLinkedListNode temp = dummy.next;
      dummy.next = temp != null ? temp.next : null;
    }
    --size;
  }

  public SinglyLinkedListNode iterate() {
    int index = 0;
    SinglyLinkedListNode dummy = head;
    while (dummy != null) {
      System.out.println("Index: " + index);
      ++index;
      dummy = dummy.next;
    }
    return head;
  }
}

class SinglyLinkedListNode {

  public int data;
  public SinglyLinkedListNode next;

  public SinglyLinkedListNode() {
    this.data = -1;
  }

  public SinglyLinkedListNode(int data) {
    this.data = data;
  }
}
