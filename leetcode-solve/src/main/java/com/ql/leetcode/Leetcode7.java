package com.ql.leetcode;

public class Leetcode7 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123123));
        System.out.println(new Solution().reverse01(123123));
    }

    static class Solution {
        // 自己做法
        // 执行用时：4 ms, 在所有 Java 提交中击败了9.98%的用户
        // 内存消耗：35.9 MB, 在所有 Java 提交中击败了7.67%的用户
        public int reverse(int x) {
            String s = String.valueOf(x);
            if (s.startsWith("-")) {
                String str = new StringBuilder(s.substring(1))
                        .reverse()
                        .toString();
                if (Long.parseLong(str) > Integer.MAX_VALUE) {
                    return 0;
                } else {
                    return Integer.parseInt("-" + str);
                }
            } else {
                String str = new StringBuilder(s)
                        .reverse()
                        .toString();
                if (Long.parseLong(str) > Integer.MAX_VALUE) {
                    return 0;
                } else {
                    return Integer.parseInt(str);
                }
            }
        }

        // 优秀做法
        // 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
        // 内存消耗：35.6 MB, 在所有 Java 提交中击败了34.81%的用户
        public int reverse01(int x) {
            long n = 0;
            while (x != 0) {
                n = n * 10 + x % 10;
                x = x / 10;
            }
            return (int) n == n ? (int) n : 0;
        }
    }
}
