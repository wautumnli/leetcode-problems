package com.ql.leetcode;

public class Leetcode14 {

    public static void main(String[] args) {
        String[] strs = new String[]{"dog", "racecar", "car"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length <= 1) return strs[0];
            int min = 201;
            for (String str : strs) {
                min = Math.min(str.length(), min);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < min; i++) {
                boolean flag = true;
                for (int j = strs.length - 1; j > 0; j--) {
                    if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) sb.append(strs[0].charAt(i));
                else break;
            }
            return sb.toString();
        }
    }
}
