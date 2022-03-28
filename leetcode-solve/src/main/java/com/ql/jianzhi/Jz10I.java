package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/28 18:39
 */
public class Jz10I {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int mod = 1000000007;
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = (p + q) % mod;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(new Jz10I().fib(3));
    }
}
