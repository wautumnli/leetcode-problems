package com.ql.jianzhi;

import java.util.HashMap;

/**
 * @author wanqiuli
 * @date 2022/4/11 20:35
 */
public class Jz48 {

    /**
     * todo 待优化
     *
     * @param s the s
     * @return the {@link int} data
     */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int tmp = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int k = map.getOrDefault(s.charAt(i), -1);
            map.put(s.charAt(i), i);
            tmp = tmp < i - k ? tmp + 1 : i - k;
            res = Math.max(res, tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Jz48().lengthOfLongestSubstring("abba"));
    }
}
