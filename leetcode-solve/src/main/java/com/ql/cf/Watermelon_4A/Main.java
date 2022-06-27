package com.ql.cf.Watermelon_4A;

import java.util.Scanner;

/**
 * @author wanqiuli
 * @date 2022/4/12 11:31
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0 && n != 2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
