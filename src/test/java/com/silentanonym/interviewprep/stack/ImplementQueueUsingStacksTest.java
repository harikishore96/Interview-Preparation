package com.silentanonym.interviewprep.stack;

import org.junit.jupiter.api.Test;

class ImplementQueueUsingStacksTest {

    ImplementQueueUsingStacks implementQueueUsingStacks = new ImplementQueueUsingStacks();

    @Test
    public void test_MyQueue() {

        // Input,
        //      ["MyQueue","push","push","peek","pop","empty"]
        //      [[],[1],[2],[],[],[]]
        // Expected Output : [null, null, null, 1, 1, false]
        ImplementQueueUsingStacks.MyQueue myQueue = implementQueueUsingStacks.new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
    }
}
