package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1051
 * 
 * A school is trying to take an annual photo of all the students. The students
 * are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where
 * expected[i] is the expected height of the ith student in line.
 * 
 * You are given an integer array heights representing the current order that
 * the students are standing in. Each heights[i] is the height of the ith
 * student in line (0-indexed).
 * 
 * Return the number of indices where heights[i] != expected[i].
 * 
 * Example 1: Input: heights = [1,1,4,2,1,3] Output: 3 Explanation: heights:
 * [1,1,4,2,1,3] expected: [1,1,1,2,3,4] Indices 2, 4, and 5 do not match.
 *
 */
public class HeightChecker {
	public static int heightChecker(int[] heights) {
		int count = 0;
		int[] expected = new int[heights.length];
		for (int k = 0; k < heights.length; k++) {
			expected[k] = heights[k];
		}

		for (int i = 1; i < expected.length; i++) {
			int j = i - 1;
			int temp = expected[i];
			while (j >= 0 && expected[j] > temp) {
				expected[j + 1] = expected[j];
				j = j - 1;
			}
			expected[j + 1] = temp;
		}

		int index = expected.length - 1;
		while (index >= 0) {
			if (expected[index] != heights[index]) {
				count++;
			}
			index--;
		}
		return count;

	}

	public static void main(String[] args) {
		// int[] heights = { 1, 1, 4, 2, 1, 3 };
		int[] heights = { 5, 1, 2, 3, 4 };
		System.out.println(heightChecker(heights));
	}
}
