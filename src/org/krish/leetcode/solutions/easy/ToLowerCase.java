package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 709
 * 
 * Given a string s, return the string after replacing every uppercase letter
 * with the same lowercase letter.
 * 
 * Example 1: Input: s = "Hello" Output: "hello"
 * 
 * Example 2: Input: s = "here" Output: "here"
 *
 */
public class ToLowerCase {
	public static String toLowerCase(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if ((int) ch[i] >= 65 && (int) ch[i] <= 90) {
				int x = (int) ch[i] + 32;
				ch[i] = (char) x;
			}
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		// String s = "";
		String s = "al&phaBET";
		System.out.println(toLowerCase(s));
	}
}
