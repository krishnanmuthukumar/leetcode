package org.krish.leetcode.solutions.easy;

import java.util.Arrays;

/**
 * LeetCode Problem No : 977
 * 
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * 
 * Example 1:
 * 
 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After
 * squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes
 * [0,1,9,16,100]. Example 2:
 * 
 * Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
 *
 */
public class SquaresOfSortedArray {
	public static int[] sortedSquares(int[] nums) {
		int[] sqnums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			sqnums[i] = nums[i] * nums[i];
		}
		Arrays.sort(sqnums);
		return sqnums;
	}

	public static void main(String[] args) {

		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}
}
