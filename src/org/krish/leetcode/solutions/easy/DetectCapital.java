package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 520
 * 
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 
 * All letters in this word are capitals, like "USA".
 * 
 * All letters in this word are not capitals, like "leetcode".
 * 
 * Only the first letter in this word is capital, like "Google".
 * 
 * Given a string word, return true if the usage of capitals in it is right.
 * 
 * Example 1: Input: word = "USA" Output: true
 * 
 * Example 2: Input: word = "FlaG" Output: false
 *
 */
public class DetectCapital {
	public static boolean detectCapitalUse(String word) {

		if (word.length() == 1)
			return true;
		int count = 0;
		int strLength = word.length();
		if ((int) word.charAt(0) >= 65 && (int) word.charAt(0) <= 90) {
			for (int i = 1; i < strLength; i++) {
				if ((int) word.charAt(i) >= 65 && (int) word.charAt(i) <= 95) {
					count++;
				}
			}
			if (count == strLength - 2) {
				return true;
			} else {
				return false;
			}
		} else {
			for (int i = 1; i < strLength; i++) {
				if ((int) word.charAt(i) >= 65 && (int) word.charAt(i) <= 95) {
					count++;
				}
			}
			if (count == strLength - 2) {
				return false;
			}
		}

		return true;

	}

	public static boolean detectCapitalUse1(String word) {

		if (word.length() == 1)
			return true;
		int lowerCount = 0;
		int upperCount = 0;

		boolean firstLetterCaps = (int) word.charAt(0) >= 65 && (int) word.charAt(0) <= 90 ? true : false;

		int strLength = word.length();
		for (int i = 1; i < strLength; i++) {
			if ((int) word.charAt(i) >= 65 && (int) word.charAt(i) <= 95) {
				upperCount++;
			} else {
				lowerCount++;
			}
		}
		// ALL Caps & firstletter caps
		if (firstLetterCaps && upperCount == strLength - 1)
			return true;

		if (firstLetterCaps && upperCount == 0)
			return true;

		if (!firstLetterCaps && strLength - 1 == lowerCount)
			return true;

		return false;
	}

	public static void main(String[] args) {
		// String word = "USA";
		// String word = "leetcode";
		// String word = "Google";
		// String word = "FlaG";
		// String word = "g";
		String word = "F";
		// String word = "fAAnG";
		// System.out.println(detectCapitalUse(word));
		System.out.println(detectCapitalUse1(word));
	}
}
