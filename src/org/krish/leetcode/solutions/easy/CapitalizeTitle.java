package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 2129
 * 
 * You are given a string title consisting of one or more words separated by a
 * single space, where each word consists of English letters. Capitalize the
 * string by changing the capitalization of each word such that:
 * 
 * If the length of the word is 1 or 2 letters, change all letters to lowercase.
 * 
 * Otherwise, change the first letter to uppercase and the remaining letters to
 * lowercase.
 * 
 * Return the capitalized title.
 *
 */
public class CapitalizeTitle {
	public static String capitalizeTitle(String title) {
		String[] titles = title.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < titles.length; i++) {
			titles[i] = titles[i].toLowerCase();
			if (titles[i].length() > 2) {
				titles[i] = String.valueOf(titles[i].charAt(0)).toUpperCase()
						+ titles[i].substring(1, titles[i].length());
			}
			sb.append(titles[i]);
			sb.append(" ");
		}
		return sb.substring(0, sb.length() - 1);

	}

	public static void main(String[] args) {
		String title = "capiTalIze tHe titLe";
		String title1 = "First leTTeR of EACH Word";
		String title2 = "i lOve leetcode";
		System.out.println(capitalizeTitle(title));
		System.out.println(capitalizeTitle(title1));
		System.out.println(capitalizeTitle(title2));
	}
}
