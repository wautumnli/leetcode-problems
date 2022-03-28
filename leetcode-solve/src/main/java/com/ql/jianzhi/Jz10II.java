package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/28 19:32
 */
public class Jz10II {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 2) {
            return n;
        }
        int p = 0;
        int q = 1;
        int r = 2;
        int mod = 1000000007;
        for (int i = 2; i < n; i++) {
            p = q;
            q = r;
            r = (p + q) % mod;
        }
        return r;
    }
}
