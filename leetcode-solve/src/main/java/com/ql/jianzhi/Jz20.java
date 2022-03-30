package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/30 19:50
 */
public class Jz20 {
    public boolean isNumber(String s) {
        boolean front_oper = false;
        boolean front_e = false;
        boolean front_spot = false;
        int k = 0;
        int t = 0;
        boolean res = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res = false;
                k = i;
                break;
            }
        }
        if (res) {
            return false;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                t = i;
                break;
            }
        }
        for (int i = k; i <= t; i++) {
            char cur = s.charAt(i);
            if (cur == ' ') {
                return false;
            }
            if (('a' <= cur && 'z' >= cur) || ('A' <= cur && 'Z' >= cur)) {
                if (s.charAt(i) != 'e' && s.charAt(i) != 'E') {
                    return false;
                }
            }
            if (cur == 'e' || cur == 'E') {
                if (i > k && (s.charAt(i - 1) == '.' || (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9'))) {
                    if ((i < t) && (s.charAt(i + 1) == '.' || (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') || s.charAt(i + 1) == '+' || s.charAt(i + 1) == '-')) {
                        if (!front_e) {
                            front_e = true;
                            front_spot = false;
                            front_oper = false;
                            continue;
                        }
                    }
                }
                return false;
            }
            if (cur == '+' || cur == '-') {
                if (((i == k) || ((s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E'))) && ((i < t) && (s.charAt(i + 1) == '.' || (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')))) {
                    if (!front_oper) {
                        front_oper = true;
                        continue;
                    }
                }
                return false;
            }
            if (cur == '.') {
                if (((i > k) && (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9')) || ((i < t) && (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9'))) {
                    if (!front_spot && !front_e) {
                        front_spot = true;
                        continue;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Jz20().isNumber(" -54.53061"));
    }
}
