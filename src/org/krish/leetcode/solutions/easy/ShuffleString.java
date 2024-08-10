package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1528
 * 
 * You are given a string s and an integer array indices of the same length. The
 * string s will be shuffled such that the character at the ith position moves
 * to indices[i] in the shuffled string.
 * 
 * Return the shuffled string.
 * 
 * Example 1: Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * 
 * Output: "leetcode" Explanation: As shown, "codeleet" becomes "leetcode" after
 * shuffling.
 *
 */
public class ShuffleString {
	public static String restoreString(String s, int[] indices) {
		if (s.length() != indices.length)
			return s;

		char ans[] = new char[s.length()];
		for (int i = 0; i < indices.length; i++) {
			ans[indices[i]] = s.charAt(i);
		}
		return String.valueOf(ans);
	}

	public static void main(String[] args) {
		String s = "codeleet";
		int indices[] = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String s1 = "abc";
		int indices1[] = { 0, 1, 2 };

		String s2 = "abc";
		int indices2[] = {};

		System.out.println(restoreString(s, indices));
		System.out.println(restoreString(s1, indices1));
		System.out.println(restoreString(s2, indices2));
	}
}
