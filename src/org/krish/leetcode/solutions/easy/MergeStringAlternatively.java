package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1768
 * 
 * You are given two strings word1 and word2. Merge the strings by adding
 * letters in alternating order, starting with word1. If a string is longer than
 * the other, append the additional letters onto the end of the merged string.
 * 
 * Return the merged string.
 * 
 * Example 1:
 * 
 * Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged
 * string will be merged as so: word1: a b c word2: p q r merged: a p b q c r
 *
 */
public class MergeStringAlternatively {

	public static String mergeAlternately1(String word1, String word2) {
		StringBuilder br = new StringBuilder();
		int i = 0, j = 0;
		while (i < word1.length() || j < word2.length()) {
			if (i < word1.length()) {
				br.append(word1.charAt(i));
				i++;
			}
			if (j < word2.length()) {
				br.append(word2.charAt(j));
				j++;
			}
		}
		return br.toString();
	}

	public static void main(String[] args) {
		String word1 = "abcd", word2 = "pqr";
		System.out.println(Math.max(word1.length(), word2.length()));
		System.out.println(mergeAlternately1(word1, word2));
	}
}
