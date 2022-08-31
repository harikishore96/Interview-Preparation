package com.silentanonym.interviewprep.tree;

public class BinaryTree<T> {
  private Node<T> root;

  class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(T data) {
      this.data = data;
    }

    @Override
    public String toString() {
      return "Node{" +
          "data=" + data +
          ", left=" + left +
          ", right=" + right +
          '}';
    }
  }

  public void add(T data) {
    if(root == null) {
      root = new Node(data);
    }
  }

  public Node<T> getRoot() {
    return this.root;
  }

  public static void main(String[] args) {
    BinaryTree<Integer> binaryTree = new BinaryTree<>();
    binaryTree.add(1);
    System.out.println(binaryTree.getRoot());
  }
}
