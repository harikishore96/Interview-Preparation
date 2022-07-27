package com.silentanonym.interviewprep.hashmap;

import java.util.LinkedList;

public class DesignHashSet {

}

class MyHashSet {

  private Bucket[] buckets;
  private int capacity = 100;

  public MyHashSet() {
    buckets = new Bucket[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new Bucket();
    }
  }

  private int hashCode(int key) {
    return key % capacity;
  }

  public void add(int key) {
    int _hash = hashCode(key);
    buckets[_hash].insert(key);
  }

  public void remove(int key) {
    int _hash = hashCode(key);
    buckets[_hash].delete(key);
  }

  public boolean contains(int key) {
    int _hash = hashCode(key);
    return buckets[_hash].contains(key);
  }
}

class Bucket {

  private LinkedList<Integer> list;

  public Bucket() {
    list = new LinkedList<>();
  }

  public void insert(Integer key) {
    if (!contains(key)) {
      list.addFirst(key);
    }
  }

  public void delete(Integer key) {
    if (contains(key)) {
      list.remove(key);
    }
  }

  public boolean contains(Integer key) {
    return list.indexOf(key) != -1;
  }
}
