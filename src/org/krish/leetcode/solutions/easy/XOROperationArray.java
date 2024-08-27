package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1486
 * 
 * You are given an integer n and an integer start.
 * 
 * Define an array nums where nums[i] = start + 2 * i (0-indexed) and n ==
 * nums.length.
 * 
 * Return the bitwise XOR of all elements of nums.
 * 
 * Example 1:
 * 
 * Input: n = 5, start = 0 Output: 8 Explanation: Array nums is equal to [0, 2,
 * 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8. Where "^" corresponds to bitwise XOR
 * operator.
 *
 */
public class XOROperationArray {
	public static int xorOperation(int n, int start) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum ^ (start + 2 * i);
		}
		return sum;
	}

	public static void main(String[] args) {
		// int n = 5, start = 0;
		int n = 4, start = 3;
		System.out.println(xorOperation(n, start));
	}
}
