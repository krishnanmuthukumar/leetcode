package org.krish.leetcode.solutions.easy;

import java.util.Arrays;

/**
 * LeetCode Problem No : 1346
 * 
 * Given an array arr of integers, check if there exist two indices i and j such
 * that : i != j 0 <= i, j < arr.length arr[i] == 2 * arr[j]
 * 
 * Example 1: Input: arr = [10,2,5,3] Output: true Explanation: For i = 0 and j
 * = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 * 
 * Example 2: Input: arr = [3,1,7,11] Output: false Explanation: There is no i
 * and j that satisfy the conditions.
 *
 */
public class CheckNandDoubleExists {
	public static boolean checkIfExist(int[] arr) {
		int[] numIndices = new int[2];
		boolean res = false;
		if (arr.length < 2 && arr.length <= 500)
			return false;

		outerloop: for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == (2 * arr[j])) {
					numIndices[0] = i;
					numIndices[1] = j;
					res = true;
					break outerloop;
				}

				if (arr[i] == (arr[j] / 2) && arr[j] % 2 == 0) {
					numIndices[0] = i;
					numIndices[1] = j;
					res = true;
					break outerloop;
				}
			}
		}
		System.out.println(Arrays.toString(numIndices));
		return res;

	}

	public static void main(String[] args) {
		// int[] nums = { 10, 2, 5, 3 };
		// int[] nums = { 3, 1, 7, 11 };
		// int[] nums = { 0, 0 };
//		int[] nums = { 7, 1, 14, 11 };
		// int[] nums = { 3, 1, 7, 11 };
		int[] nums = { -2, 0, 10, -19, 4, 6, -8 };

		System.out.println(checkIfExist(nums));
	}
}
