package com.silentanonym.interviewprep.linkedlist;

/**
 * 707. Design Linked List https://leetcode.com/problems/design-linked-list/
 */
public class DesignLinkedList {

}

class MyLinkedList {

  private Node head;
  private int size;

  public Node getHead() {
    return this.head;
  }

  public int size() {
    return this.size;
  }

  public MyLinkedList() {
    head = null;
    size = 0;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    Node dummy = head;
    for (int iIndex = 0; iIndex < index; iIndex++) {
      dummy = dummy.next;
    }
    return dummy.data;
  }

  public void addAtHead(int val) {
    Node curr = new Node(val);
    if (head != null) {
      curr.next = head;
    }
    head = curr;
    ++size;
  }

  public void addAtTail(int val) {
    Node curr = new Node(val);
    if (head == null) {
      head = curr;
    } else {
      Node dummy = head;
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
      Node curr = new Node(val);
      Node dummy = head;
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
      Node dummy = head;
      for (int iIndex = 0; iIndex < index - 1; ++iIndex) {
        dummy = dummy.next;
      }
      Node temp = dummy.next;
      dummy.next = temp != null ? temp.next : null;
    }
    --size;
  }

  public Node iterate() {
    int index = 0;
    Node dummy = head;
    while (dummy != null) {
      System.out.println("Index: " + index);
      ++index;
      dummy = dummy.next;
    }
    return head;
  }
}

class Node {

  public int data;
  public Node next;

  public Node() {
    this.data = -1;
  }

  public Node(int data) {
    this.data = data;
  }
}
