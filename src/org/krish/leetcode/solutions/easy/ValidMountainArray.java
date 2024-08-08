package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 941
 * 
 * Given an array of integers arr, return true if and only if it is a valid
 * mountain array.
 * 
 * Recall that arr is a mountain array if and only if:
 * 
 * arr.length >= 3 There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] arr[i] > arr[i + 1] > ... >
 * arr[arr.length - 1]
 * 
 * Example 1: Input: arr = [2,1] Output: false
 * 
 * Example 2: Input: arr = [3,5,5] Output: false
 * 
 * Example 3: Input: arr = [0,3,2,1] Output: true
 *
 */
public class ValidMountainArray {
	public static boolean validMountainArray(int[] arr) {
		if (arr.length < 3 || arr[0] > arr[1])
			return false;

		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[j]) {
				j = i;
			}
		}

		if (j == arr.length - 1) {
			return false;
		}

		for (int i = 1; i < j; i++) {
			if (arr[i] <= arr[i - 1]) {
				return false;
			}
		}

		for (int i = j; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// int[] arr = { 2, 1 };
		int[] arr = { 3, 5, 5 };
		// int[] arr = {0,3,2,1};
		// int[] arr = { 3, 6, 5, 6, 7, 6, 5, 3, 0 };
		// int[] arr = { 0, 2, 3, 4, 5, 2, 1, 0 };
		// int[] arr = { 0, 2, 3, 3, 5, 2, 1, 0 };
		// int[] arr = { 2, 0, 2 };
		// int[] arr = { 2, 0, 2, 5 };
		// int[] arr ={0,1,2,3,4,5,6,7,8,9};
		// int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println(validMountainArray(arr));
	}
}
