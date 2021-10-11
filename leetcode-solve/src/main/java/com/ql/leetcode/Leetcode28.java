package com.ql.leetcode;

public class Leetcode28 {

    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        System.out.println(new Solution().strStr(haystack, needle));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.equals("")) return 0;
            if (needle.length() > haystack.length()) return -1;
            if (needle.length() == haystack.length() && needle.equals(haystack)) {
                return 0;
            }

            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0) && needle.equals(haystack.substring(i, i + needle.length()))) {
                    return i;
                }
            }
            return -1;
        }
    }
}
