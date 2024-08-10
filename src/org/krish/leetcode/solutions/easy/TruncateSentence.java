package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1816
 * 
 * A sentence is a list of words that are separated by a single space with no
 * leading or trailing spaces. Each of the words consists of only uppercase and
 * lowercase English letters (no punctuation).
 * 
 * For example, "Hello World", "HELLO", and "hello world hello world" are all
 * sentences. You are given a sentence s​​​​​​ and an integer k​​​​​​. You want
 * to truncate s​​​​​​ such that it contains only the first k​​​​​​ words.
 * Return s​​​​​​ after truncating it.
 * 
 * Example 1: Input: s = "Hello how are you Contestant", k = 4
 * 
 * Output: "Hello how are you"
 * 
 * Explanation: The words in s are ["Hello", "how" "are", "you", "Contestant"].
 * The first 4 words are ["Hello", "how", "are", "you"]. Hence, you should
 * return "Hello how are you".
 *
 */
public class TruncateSentence {

	public static String truncateSentence(String s, int k) {
		String[] strArray = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(strArray[i]);
			sb.append(" ");
		}
		return sb.substring(0, sb.length() - 1);
	}

	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		int k = 4;

		String s1 = "What is the solution to this problem";
		int k1 = 4;

		String s2 = "chopper is not a tanuki";
		int k2 = 5;

		System.out.println(truncateSentence(s, k));
		System.out.println(truncateSentence(s1, k1));
		System.out.println(truncateSentence(s2, k2));
	}

}
