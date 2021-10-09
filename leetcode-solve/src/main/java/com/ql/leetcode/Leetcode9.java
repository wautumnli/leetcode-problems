package com.ql.leetcode;

public class Leetcode9 {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(113311));
        System.out.println(new Solution().isPalindrome01(101));
    }

    // 执行用时: 11ms
    // 内存消耗: 37.9mb
    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            if (x / 10 == 0) return true;
            int a = -1;
            int m = x;
            while (m != 0) {
                a++;
                m /= 10;
            }
            int d = (int) Math.pow(10, a);
            while (d >= 10) {
                if (x / d != x % 10) return false;
                x = x % d;
                x = x / 10;
                d = d / 100;
            }
            return true;
        }

        public boolean isPalindrome01(int x) {
            if (x < 0) return false;
            long res = 0;
            int y = x;
            while (y > 0) {
                res = res * 10 + y % 10;
                y = y / 10;
            }
            return (int) res == res && res == x;
        }
    }
}