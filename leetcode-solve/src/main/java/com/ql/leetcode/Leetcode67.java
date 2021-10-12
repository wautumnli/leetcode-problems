package com.ql.leetcode;

import java.util.Arrays;

public class Leetcode67 {

    public static void main(String[] args) {
        System.out.println(new Leetcode67().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        if (lena == 0) return b;
        if (lenb == 0) return a;
        int carry = 0;
        int i = lena - 1;
        int j = lenb - 1;
        StringBuilder sb = new StringBuilder();
        while (i != -1 || j != -1) {
            if (i != -1) {
                carry += Integer.parseInt(a.substring(i, i + 1));
                i--;
            }
            if (j != -1) {
                carry += Integer.parseInt(b.substring(j, j + 1));
                j--;
            }
            sb.append(carry % 2);
            carry = carry / 2;
        }
        if (carry == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
