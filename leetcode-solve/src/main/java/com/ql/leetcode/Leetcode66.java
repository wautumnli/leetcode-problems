package com.ql.leetcode;

public class Leetcode66 {

    static class Solution {
        public int[] plusOne(int[] digits) {
            int aux = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i] = digits[i] + aux;
                if (digits[i] == 10 && i == 0) {
                    int[] res = new int[digits.length + 1];
                    res[0] = 1;
                    return res;
                } else if (digits[i] == 10){
                    digits[i] = 0;
                } else break;
            }
            return digits;
        }
    }
}
