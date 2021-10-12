package com.ql.leetcode;

public class Leetcode70 {

    public static void main(String[] args) {
        System.out.println(new Leetcode70().climbStairs(3));
    }

    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int f1 = 1;
        int f2 = 2;
        for (int i = 3; i < n; i++) {
            int k = f1 + f2;
            f1 = f2;
            f2 = k;
        }
        return f1 + f2;
    }
}
