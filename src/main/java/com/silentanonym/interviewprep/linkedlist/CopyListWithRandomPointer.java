package com.silentanonym.interviewprep.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

  // Using Hash Map
  public Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }
    Map<Node, Node> map = new HashMap<>();
    Node dummy = head;
    while (dummy != null) {
      map.put(dummy, new Node(dummy.val));
      dummy = dummy.next;
    }

    for (Node key : map.keySet()) {
      Node newNode = map.get(key);
      newNode.next = map.get(key.next);
      newNode.random = map.get(key.random);
    }
    return map.get(head);
  }
}

// Definition for a Node.
class Node {

  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}
