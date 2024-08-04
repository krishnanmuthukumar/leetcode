package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 9
 * 
 * Given an integer x, return true if x is a palindrome , and false otherwise.
 * 
 * Example 1:
 * 
 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
 * and from right to left. Example 2:
 * 
 * Input: x = -121 Output: false Explanation: From left to right, it reads -121.
 * From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * 
 * Input: x = 10 Output: false Explanation: Reads 01 from right to left.
 * Therefore it is not a palindrome.
 **/

public class PalindromeNumber {
	public boolean isPalindrome(int x) {

		if (x == 0 || x < 0) {
			return false;
		} else if (reverse(x) == x) {
			return true;
		} else {
			return false;
		}

	}

	public static int reverse(int n) {
		int reverse = 0, reminder = 0;
		while (n != 0) {
			reminder = n % 10;
			reverse = reverse * 10 + reminder;
			n = n / 10;
		}
		return reverse;

	}

	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		System.out.println(p.isPalindrome(10));
	}
}
