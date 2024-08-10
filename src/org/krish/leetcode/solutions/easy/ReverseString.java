package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 344
 * 
 * Write a function that reverses a string. The input string is given as an
 * array of characters s.
 * 
 * You must do this by modifying the input array in-place with O(1) extra
 * memory.
 * 
 * Example 1:
 * 
 * Input: s = ["h","e","l","l","o"] Output: ["o","l","l","e","h"]
 *
 */
public class ReverseString {
	public static void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		while (left <= right / 2) {
			char temp = s[left];
			s[left] = s[right - left];
			s[right - left] = temp;
			left++;
		}
		System.out.print(s);
	}

	public static void reverseString2(char[] s) {
		for (int i = 0; i < s.length / 2; i++) {
			char temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
		System.out.print(s);
	}

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		char[] s3 = { 'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a',
				'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a' };
		System.out.print(s3);
		System.out.println();
		reverseString2(s3);
	}
}
