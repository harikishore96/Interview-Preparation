package com.silentanonym.interviewprep.stack;

import java.util.Stack;

public class ValidParentheses {

    // Runtime: 4ms
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char character : s.toCharArray()) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) return false;
                char openingBracket = stack.pop();
                if (!((openingBracket == '(' && character == ')')
                        || (openingBracket == '[' && character == ']')
                        || (openingBracket == '{' && character == '}'))) return false;
            }
        }
        return stack.isEmpty();
    }

    // Runtime: 4ms
    public boolean isValid1(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char character : s.toCharArray()) {
            if (character == '(') stack.push(')');
            else if (character == '[') stack.push(']');
            else if (character == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != character) return false;
        }
        return stack.isEmpty();
    }

    // Array Stack
    // Runtime: 1ms
    public boolean isValid2(String s) {
        if (s.length() % 2 != 0) return false;
        char[] stack = new char[s.length()];
        int head = 0;
        for (char character : s.toCharArray()) {
            switch (character) {
                case '(':
                    stack[head++] = ')';
                    break;
                case '[':
                    stack[head++] = ']';
                    break;
                case '{':
                    stack[head++] = '}';
                    break;
                default:
                    if (head == 0 || stack[--head] != character) return false;
            }
        }
        return head == 0;
    }
}
