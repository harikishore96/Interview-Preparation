package com.silentanonym.interviewprep.trie;

public class Trie {

  private Node root;

  public Trie() {
    this.root = new Node();
  }

  public void insert(String word) {
    Node node = root;
    for (char letter : word.toCharArray()) {
      if (!node.containsKey(letter)) {
        node.put(letter, new Node());
      }
      node = node.get(letter);
    }
    node.setIsWord();
  }

  public boolean search(String word) {
    Node node = root;
    for (char letter : word.toCharArray()) {
      if (!node.containsKey(letter)) {
        return false;
      }
      node = node.get(letter);
    }
    return node.isWord();
  }

  public boolean startsWith(String prefix) {
    Node node = root;
    for (char letter : prefix.toCharArray()) {
      if (!node.containsKey(letter)) {
        return false;
      }
      node = node.get(letter);
    }
    return true;
  }
}

class Node {

  private Node[] alphabets = new Node[26];
  private boolean isWord = false;

  public boolean containsKey(char letter) {
    return get(letter) != null;
  }

  public Node get(char letter) {
    return alphabets[letter - 'a'];
  }

  public void put(char letter, Node node) {
    alphabets[letter - 'a'] = node;
  }

  public boolean isWord() {
    return this.isWord;
  }

  public void setIsWord() {
    this.isWord = true;
  }
}
