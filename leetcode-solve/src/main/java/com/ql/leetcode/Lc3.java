package com.ql.leetcode;

/**
 * @author wanqiuli
 * @date 2022/3/26 14:04
 */
public class Lc3 {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int cur = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            cur = Math.max(cur, last[index] + 1);
            max = Math.max(max, i - cur + 1);
            last[index] = i;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Lc3().lengthOfLongestSubstring("abba"));
    }
}
