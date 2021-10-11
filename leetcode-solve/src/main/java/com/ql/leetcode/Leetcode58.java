package com.ql.leetcode;

public class Leetcode58 {

    static class Solution {
        public int lengthOfLastWord(String s) {
            int length = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ' && length != 0) return length;
                if (s.charAt(i) != ' ') length++;
            }
            return length;
        }
    }
}
