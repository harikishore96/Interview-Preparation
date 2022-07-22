package com.silentanonym.interviewprep.linkedlist;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DesignLinkedListTest {

  MyLinkedList linkedList = new MyLinkedList();

  @Test
  void addAtHead() {
    linkedList.addAtHead(0);
    linkedList.addAtHead(1);
    linkedList.addAtHead(2);
    linkedList.addAtHead(3);
    print(linkedList.getHead());
  }

  @Test
  void addAtTail() {
    linkedList.addAtTail(0);
    linkedList.addAtTail(1);
    linkedList.addAtTail(2);
    linkedList.addAtTail(3);
    print(linkedList.getHead());
  }

  @Test
  void addAtIndex() {
    linkedList.addAtIndex(1, 0);
    print(linkedList.getHead());
    Assertions.assertEquals(-1, linkedList.get(0));

    linkedList = new MyLinkedList();
    linkedList.addAtIndex(0, 0);
    linkedList.addAtIndex(1, 1);
    linkedList.addAtIndex(2, 2);
    linkedList.addAtIndex(3, 3);
    linkedList.addAtIndex(0, 4);
    print(linkedList.getHead());
  }

  @Test
  void deleteAtIndex() {
    linkedList.addAtIndex(0, 0);
    linkedList.addAtIndex(1, 1);
    linkedList.addAtIndex(2, 2);
    linkedList.addAtIndex(3, 3);
    linkedList.deleteAtIndex(40000);
    print(linkedList.getHead());
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

  private void print(Node head) {
    List<Integer> elements = new ArrayList<>();
    Node dummy = head;
    while (dummy != null) {
      elements.add(dummy.data);
      dummy = dummy.next;
    }
    System.out.println(elements);
  }

  @Test
  void iterate() {
    linkedList.addAtTail(0);
    linkedList.addAtTail(1);
    linkedList.addAtTail(2);
    linkedList.addAtTail(3);
    print(linkedList.getHead());
    linkedList.iterate();
  }
}
