package com.ql.leetcode;

public class Leetcode13 {

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("IV"));
    }

    static class Solution {
        public int romanToInt(String s) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case 'M':
                        sum += 1000;
                        break;
                    case 'D':
                        sum += 500;
                        break;
                    case 'C':
                        if ((i + 1 < s.length()) && s.charAt(i + 1) == 'D') {
                            sum += 400;
                            i++;
                        } else if ((i + 1 < s.length()) && s.charAt(i + 1) == 'M') {
                            sum += 900;
                            i++;
                        } else sum += 100;
                        break;
                    case 'L':
                        sum += 50;
                        break;
                    case 'X':
                        if ((i + 1 < s.length()) && s.charAt(i + 1) == 'L') {
                            sum += 40;
                            i++;
                        } else if ((i + 1 < s.length()) && s.charAt(i + 1) == 'C') {
                            sum += 90;
                            i++;
                        } else sum += 10;
                        break;
                    case 'V':
                        sum += 5;
                        break;
                    case 'I':
                        if ((i + 1 < s.length()) && s.charAt(i + 1) == 'V') {
                            sum += 4;
                            i++;
                        } else if ((i + 1 < s.length()) && s.charAt(i + 1) == 'X') {
                            sum += 9;
                            i++;
                        } else sum += 1;
                        break;
                }
            }
            return sum;
        }
    }
}
