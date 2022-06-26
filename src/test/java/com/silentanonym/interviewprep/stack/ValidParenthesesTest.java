package com.silentanonym.interviewprep.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValid() {
        Assertions.assertTrue(validParentheses.isValid("()"));
        Assertions.assertTrue(validParentheses.isValid("()[]{}"));
        Assertions.assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    void isValid1() {
        Assertions.assertTrue(validParentheses.isValid1("()"));
        Assertions.assertTrue(validParentheses.isValid1("()[]{}"));
        Assertions.assertFalse(validParentheses.isValid1("(]"));
    }

    @Test
    void isValid2() {
        Assertions.assertTrue(validParentheses.isValid2("()"));
        Assertions.assertTrue(validParentheses.isValid2("()[]{}"));
        Assertions.assertFalse(validParentheses.isValid2("(]"));
    }
}
