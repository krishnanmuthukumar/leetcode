package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1374
 * 
 * Given an integer n, return a string with n characters such that each
 * character in such string occurs an odd number of times.
 * 
 * The returned string must contain only lowercase English letters. If there are
 * multiples valid strings, return any of them.
 * 
 * Example 1:
 * 
 * Input: n = 4 Output: "pppz" Explanation: "pppz" is a valid string since the
 * character 'p' occurs three times and the character 'z' occurs once. Note that
 * there are many other valid strings such as "ohhh" and "love".
 *
 */
public class StringWithOddCounts {
	public static String generateTheString(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n - 1; i++) {
			sb.append("a");
		}
		if (n % 2 == 0) {
			sb.append("b");
		} else {
			sb.append("a");
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		int n = 4;
		int n1 = 2;
		int n3 = 7;
		System.out.println(generateTheString(n));
		System.out.println(generateTheString(n1));
		System.out.println(generateTheString(n3));
	}
}
