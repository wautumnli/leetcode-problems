package com.ql.leetcode;

/**
 * @author wanqiuli
 */
public class Leetcode125 {

    public static void main(String[] args) {
        char c = '1';
        System.out.println(c & 0xDF);
    }

    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < s.length() && !((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                    (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) {
                i++;
            }
            while (j >= 0 && !((s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') ||
                    (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') ||
                    (s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
                j--;
            }
            if (i < j) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
}
