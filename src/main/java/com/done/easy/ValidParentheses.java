package com.done.easy;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']'.
 * Determine if the input string is valid.
 *
 * An input string is valid if:
 *  - Open brackets must be closed by the same type of brackets.
 *  - Open brackets must be closed in the correct order.
 *
 * Example 1:
 *  Input: s = "()"
 *  Output: true
 *
 * Example 2:
 *  Input: s = "()[]{}"
 *  Output: true
 *
 * Example 3:
 *  Input: s = "(]"
 *  Output: false
 *
 * ---
 * If character is open parentheses - add to stack.
 * If character is close parentheses - check for previous stack element.
 * Else add to stack.
 * Last step is check stack for empty.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> parenthesesStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                parenthesesStack.add(c);
            } else if (!parenthesesStack.isEmpty() &&
                      ((c == ')' && parenthesesStack.peek() == '(') ||
                       (c == '}' && parenthesesStack.peek() == '{') ||
                       (c == ']' && parenthesesStack.peek() == '['))) {
                parenthesesStack.pop();
            } else {
                parenthesesStack.push(c);
            }
        }
        return parenthesesStack.empty();
    }
}
