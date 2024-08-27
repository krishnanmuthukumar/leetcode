package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1662
 * 
 * Given two string arrays word1 and word2, return true if the two arrays
 * represent the same string, and false otherwise.
 * 
 * A string is represented by an array if the array elements concatenated in
 * order forms the string.
 * 
 * Example 1:
 * 
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"] Output: true Explanation:
 * word1 represents string "ab" + "c" -> "abc" word2 represents string "a" +
 * "bc" -> "abc" The strings are the same, so return true.
 *
 */
public class TwoStringEqual {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder str1 = new StringBuilder();
		for (String str : word1) {
			str1.append(str);
		}
		StringBuilder str2 = new StringBuilder();
		for (String str : word2) {
			str2.append(str);
		}
		return str1.toString().equals(str2.toString());
	}

	public static void main(String[] args) {
		String[] word1 = { "ab", "c" }, word2 = { "a", "bc" };
		String[] word3 = { "a", "cb" }, word4 = { "ab", "c" };
		String[] word5 = { "abc", "d", "defg" }, word6 = { "abcddefg" };
		System.out.println(arrayStringsAreEqual(word1, word2));
		System.out.println(arrayStringsAreEqual(word3, word4));
		System.out.println(arrayStringsAreEqual(word5, word6));
	}
}
