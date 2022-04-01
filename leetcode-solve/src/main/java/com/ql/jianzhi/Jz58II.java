package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/1 9:21
 */
public class Jz58II {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
