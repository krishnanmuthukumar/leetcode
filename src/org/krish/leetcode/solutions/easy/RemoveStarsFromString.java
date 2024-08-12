package org.krish.leetcode.solutions.easy;

import java.util.Iterator;
import java.util.Stack;

/**
 * LeetCode Problem No : 2390
 * 
 * You are given a string s, which contains stars *. In one operation, you can:
 * Choose a star in s. Remove the closest non-star character to its left, as
 * well as remove the star itself. Return the string after all stars have been
 * removed.
 * 
 * Note: The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "leet**cod*e"
 * 
 * Output: "lecoe"
 * 
 * Explanation: Performing the removals from left to right: - The closest
 * character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e". -
 * The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes
 * "lecod*e". - The closest character to the 3rd star is 'd' in "lecod*e". s
 * becomes "lecoe". There are no more stars, so we return "lecoe".
 *
 */
public class RemoveStarsFromString {
	public static String removeStars(String s) {
		Stack<String> st = new Stack<String>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] != '*') {
				st.push(String.valueOf(c[i]));
			} else {
				st.pop();
			}
		}
		String result = "";
		Iterator<String> itr = st.iterator();
		while (itr.hasNext()) {
			result = result + itr.next();
		}
		return result.toString();

	}

	public static void main(String[] args) {
		String s = "leet**cod*e";
		String s2 = "erase*****";
		System.out.println(removeStars(s));
		System.out.println(removeStars(s2));
	}
}
