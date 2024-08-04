package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 3110
 * 
 * You are given a string s. The score of a string is defined as the sum of the
 * absolute difference between the ASCII values of adjacent characters.
 * 
 * Return the score of s.
 * 
 * Example 1:
 * 
 * Input: s = "hello"
 * 
 * Output: 13
 * 
 * Explanation:
 * 
 * The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108,
 * 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 -
 * 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
 * 
 * Example 2:
 * 
 * Input: s = "zaz"
 * 
 * Output: 50
 * 
 * Explanation:
 * 
 * The ASCII values of the characters in s are: 'z' = 122, 'a' = 97. So, the
 * score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.
 * 
 * 
 * Constraints:
 * 
 * 2 <= s.length <= 100 s consists only of lowercase English letters.
 */

public class ScoreOfString {
	public static int scoreOfString(String s) {
		int sum = 0;
		char[] chars = s.toCharArray();

		if (chars.length < 2 && chars.length > 100)
			return sum;

		for (int i = 0; i < chars.length - 1; i = i + 1) {
			sum = sum + (Math.abs((int) chars[i] - (int) chars[i + 1]));
		}
		return sum;

	}

	public static void main(String[] args) {
		String str = "zaz";
		// String str = "hello";
		System.out.println(scoreOfString(str));
	}
}
