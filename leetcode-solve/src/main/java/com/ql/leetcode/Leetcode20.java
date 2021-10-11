package com.ql.leetcode;

import java.util.Stack;

public class Leetcode20 {

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("{[]}"));
    }

    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '(':
                        stack.push('(');
                        break;
                    case ')':
                        if (stack.empty()) {
                            stack.push(')');
                        } else {
                            if (stack.peek() == '(') {
                                stack.pop();
                            } else {
                                return false;
                            }
                        }
                        break;
                    case '[':
                        stack.push('[');
                        break;
                    case ']':
                        if (stack.empty()) {
                            stack.push(']');
                        } else {
                            if (stack.peek() == '[') {
                                stack.pop();
                            } else {
                                return false;
                            }
                        }
                        break;
                    case '{':
                        stack.push('{');
                        break;
                    case '}':
                        if (stack.empty()) {
                            stack.push('}');
                        } else {
                            if (stack.peek() == '{') {
                                stack.pop();
                            } else {
                                return false;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            return stack.empty();
        }
    }
}
