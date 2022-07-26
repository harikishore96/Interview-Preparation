package com.silentanonym.interviewprep.linkedlist;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DesignDoublyLinkedListTest {

  MyLinkedList linkedList = new MyLinkedList();

  @Test
  void addAtIndex() {
    linkedList = new MyLinkedList();
    linkedList.addAtIndex(0, 0);
    linkedList.addAtIndex(1, 1);
    linkedList.addAtIndex(2, 2);
    linkedList.addAtIndex(3, 4);
    linkedList.addAtIndex(3, 3);
    linkedList.addAtIndex(0, 5);
    linkedList.addAtIndex(-1, -1);
    linkedList.addAtIndex(100, -1);
    printHead(linkedList.getHead());
    printTail(linkedList.getTail());
  }

  @Test
  void addAtHead() {
    linkedList = new MyLinkedList();
    linkedList.addAtHead(0);
    linkedList.addAtHead(1);
    linkedList.addAtHead(2);
    linkedList.addAtHead(3);
    printHead(linkedList.getHead());
    printTail(linkedList.getTail());
  }

  @Test
  void addAtTail() {
    linkedList = new MyLinkedList();
    linkedList.addAtTail(0);
    linkedList.addAtTail(1);
    linkedList.addAtTail(2);
    linkedList.addAtTail(3);
    printHead(linkedList.getHead());
    printTail(linkedList.getTail());
  }

  @Test
  void deleteAtIndex() {

    // Test Case 1
    linkedList = new MyLinkedList();
    linkedList.addAtIndex(0, 0);
    linkedList.deleteAtIndex(0);
    printHead(linkedList.getHead());
    printTail(linkedList.getTail());

    // Test Case 2
    linkedList = new MyLinkedList();
    linkedList.addAtIndex(0, 0);
    linkedList.addAtIndex(1, 1);
    linkedList.deleteAtIndex(0);
    printHead(linkedList.getHead());
    printTail(linkedList.getTail());

    // Test Case 3
    linkedList = new MyLinkedList();
    linkedList.addAtIndex(0, 0);
    linkedList.addAtIndex(1, 1);
    linkedList.addAtIndex(2, 2);
    linkedList.deleteAtIndex(1);
    printHead(linkedList.getHead());
    printTail(linkedList.getTail());
  }

  @Test
  void get() {
    linkedList.addAtIndex(0, 10);
    linkedList.addAtIndex(1, 20);
    linkedList.addAtIndex(2, 30);

    Assertions.assertEquals(10, linkedList.get(0));
    Assertions.assertEquals(20, linkedList.get(1));
    Assertions.assertEquals(30, linkedList.get(2));
    Assertions.assertEquals(-1, linkedList.get(3));
  }

  private void printHead(Node head) {
    System.out.println("Head,");
    List<Integer> elements = new ArrayList<>();
    Node dummy = head;
    while (dummy != null) {
      elements.add(dummy.data);
      System.out.println(dummy);
      dummy = dummy.next;
    }
//    System.out.println(elements);
  }

  private void printTail(Node tail) {
    System.out.println("Tail,");
    Node dummy = tail;
    while (dummy != null) {
      System.out.println(dummy);
      dummy = dummy.prev;
    }
  }
}
