package com.silentanonym.interviewprep.trie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrieTest {

  Trie trie = new Trie();

  @Test
  void insert() {
    trie.insert("apple");
    Assertions.assertTrue(trie.search("apple"));
  }

  @Test
  void search() {
    trie.insert("apple");
    Assertions.assertTrue(trie.search("apple"));
    Assertions.assertFalse(trie.search("app"));

    trie.insert("app");
    Assertions.assertTrue(trie.search("app"));
  }

  @Test
  void startsWith() {
    trie.insert("apple");
    Assertions.assertTrue(trie.startsWith("app"));
  }
}
