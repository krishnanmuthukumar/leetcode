package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1154
 * 
 * Given a string date representing a Gregorian calendar date formatted as
 * YYYY-MM-DD, return the day number of the year.
 * 
 * Example 1:
 * 
 * Input: date = "2019-01-09" Output: 9 Explanation: Given date is the 9th day
 * of the year in 2019.
 *
 */
public class DayOfTheYear {
	public static int dayOfYear(String date) {
		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int months_leapyear[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dt = date.split("-");
		int day = 0;
		if ((Integer.valueOf(dt[0]) % 4 == 0 && Integer.valueOf(dt[0]) % 100 != 0)
				|| Integer.valueOf(dt[0]) % 400 == 0) {
			for (int i = 0; i < Integer.valueOf(dt[1]) - 1; i++) {
				day = day + months_leapyear[i];
			}
		} else {
			for (int i = 0; i < Integer.valueOf(dt[1]) - 1; i++) {
				day = day + months[i];
			}
		}
		day = day + Integer.valueOf(dt[2]);
		return day;
	}

	public static void main(String[] args) {
		String date = "2019-01-09";
		String date1 = "2019-02-10";
		String date2 = "2024-08-10";
		String date3 = "1900-05-02";
		System.out.println(dayOfYear(date));
		System.out.println(dayOfYear(date1));
		System.out.println(dayOfYear(date2));
		System.out.println(dayOfYear(date3));
	}
}
