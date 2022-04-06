package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/31 20:21
 */
public class Jz50 {

    /**
     * function is firstUniqChar
     * todo 存在最优解
     *
     * @param s the s
     * @return the {@link char} data
     */
    public char firstUniqChar(String s) {
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (array[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
