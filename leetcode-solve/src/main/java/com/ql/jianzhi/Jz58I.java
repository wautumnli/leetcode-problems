package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/11 21:42
 */
public class Jz58I {

    /**
     * 可优化
     *
     * @param s the s
     * @return the {@link String} data
     */
    public String reverseWords(String s) {
        int j = s.length() - 1;
        int i = j;
        StringBuilder builder = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            builder.append(s, i + 1, j + 1).append(" ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new Jz58I().reverseWords("the sky is blue"));
    }
}
