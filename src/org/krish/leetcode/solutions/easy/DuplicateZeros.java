package org.krish.leetcode.solutions.easy;

import java.util.Arrays;

/**
 * LeetCode Problem No : 1089
 * 
 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 * 
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return
 * anything.
 * 
 * Example 1:
 * 
 * Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4] Explanation: After
 * calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 */
public class DuplicateZeros {
	public static void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length - 1; j >= i + 1; j--) {
					arr[j] = arr[j - 1];
				}
				i = i + 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// int[] nums = { 1, 0, 2, 3, 0, 4, 5, 0 }; // [1,0,0,2,3,0,0,4]
		// int[] nums = {1,2,3};
		int[] nums = { 1, 0, 2, 3 };
		duplicateZeros(nums);
	}
}
