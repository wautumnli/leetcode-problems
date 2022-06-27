package com.ql.jianzhi;

import java.util.Objects;

/**
 * @author wanqiuli
 * @date 2022/3/28 12:35
 */
public class Jz5 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Jz5().replaceSpace("We are happy"));
    }
}
