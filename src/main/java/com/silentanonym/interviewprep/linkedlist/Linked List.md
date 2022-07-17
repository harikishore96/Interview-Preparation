# Linked List

### Add an element,
1. Initialize a new node "cur" with the given value.
2. Link the "next" field of cur to prev's next node.
3. Link the "next" field in prev to cur

Time Complexity - O(1)

### Delete/Remove an element,
1. Find cur's previous node prev and its next node next.
2. Link prev to cur's next node next.