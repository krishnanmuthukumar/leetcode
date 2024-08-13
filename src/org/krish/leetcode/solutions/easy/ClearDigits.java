package org.krish.leetcode.solutions.easy;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * LeetCode Problem No : 3174
 * 
 * You are given a string s.
 * 
 * Your task is to remove all digits by doing this operation repeatedly:
 * 
 * Delete the first digit and the closest non-digit character to its left.
 * Return the resulting string after removing all digits.
 *
 */
public class ClearDigits {
	public static String clearDigits(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				st.push(s.charAt(i));
			} else {
				if (!st.isEmpty())
					st.pop();
			}
		}
		return st.stream().map(x -> x.toString()).collect(Collectors.joining(""));

	}

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "cb34";
		System.out.println(clearDigits(s1));
		System.out.println(clearDigits(s2));
	}

}
