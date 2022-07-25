# Linked List

### Add an element,
1. Initialize a new node "cur" with the given value.
2. Link the "next" field of cur to prev's next node.
3. Link the "next" field in prev to cur

Time Complexity - O(1)

### Delete/Remove an element,
1. Find cur's previous node prev and its next node next.
2. Link prev to cur's next node next.

### Two-Pointer template,
```
// Initialize slow & fast pointers
ListNode slow = head;
ListNode fast = head;
/**
 * Change this condition to fit specific problem.
 * Attention: remember to avoid null-pointer error
 **/
while (slow != null && fast != null && fast.next != null) {
    slow = slow.next;           // move slow pointer one step each time
    fast = fast.next.next;      // move fast pointer two steps each time
    if (slow == fast) {         // change this condition to fit specific problem
        return true;
    }
}
return false;   // change return value to fit specific problem
```