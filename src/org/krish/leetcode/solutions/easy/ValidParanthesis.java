package org.krish.leetcode.solutions.easy;

import java.util.Stack;

/**
 * LeetCode Problem No : 20
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order. Every close bracket has a corresponding open
 * bracket of the same type.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "()" Output: true
 *
 */
public class ValidParanthesis {
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x == '{' || x == '(' || x == '[') {
				st.push(x);
				continue;
			}

			if (st.isEmpty())
				return false;

			char c;
			switch (x) {
			case '}':
				c = st.pop();
				if (c == '(' || c == '[')
					return false;
				break;

			case ')':
				c = st.pop();
				if (c == '{' || c == '[')
					return false;
				break;

			case ']':
				c = st.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			}

		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		ValidParanthesis v = new ValidParanthesis();
		// String s = "()";
		// String s = "()[]{}";
		// String s = "(]";
		// String s = "(";
		String s = "{[]}";
		// String s = "{[}}";
		System.out.println(v.isValid(s));
	}
}
