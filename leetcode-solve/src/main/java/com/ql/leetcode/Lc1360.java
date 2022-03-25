package com.ql.leetcode;

/**
 * @author wanqiuli
 * @date 2022/3/25 13:10
 */
public class Lc1360 {

    public int daysBetweenDates(String date1, String date2) {
        String[] split1 = date1.split("-");
        String[] split2 = date2.split("-");
        int day1 = getDay(Integer.parseInt(split1[0]), Integer.parseInt(split1[1]), Integer.parseInt(split1[2]));
        int day2 = getDay(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2]));
        return Math.abs(day2 - day1);
    }

    public int getDay(int year, int month, int day) {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = day - 1;
        while (month != 0) {
            month = month - 1;
            days += months[month];
            if (month == 2 && isLeapYear(year)) {
                days += 1;
            }
        }
        days += (year - 1971) * 365;
        days += (year - 1) / 4 - 1971 / 4;
        days -= (year - 1) / 100 - 1971 / 100;
        days += (year - 1) / 400 - 1971 / 400;
        return days;
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static void main(String[] args) {
        System.out.println(new Lc1360().daysBetweenDates("2020-01-15", "2019-12-31"));
    }
}
