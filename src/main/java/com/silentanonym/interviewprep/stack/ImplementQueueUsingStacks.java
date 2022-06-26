package com.silentanonym.interviewprep.stack;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    /*
     *  Push(x), Push x to input
     *  Pop(),
     *      if(output not empty) then output.pop
     *      else
     *          transfer input to output
     *          output.pop
     *  Peek(),
     *      if(output not empty) then output.top
     *      else
     *          transfer input to output
     *          output.top
     */

    class MyQueue {

        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            transferInputToOutput();
            return output.pop();
        }

        public int peek() {
            transferInputToOutput();
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }

        private void transferInputToOutput() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
        }
    }
}
