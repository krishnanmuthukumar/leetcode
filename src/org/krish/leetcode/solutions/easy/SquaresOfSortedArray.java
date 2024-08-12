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

	public static int[] sortedSquares2(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		int[] temp = new int[nums.length];
		int k = nums.length - 1;
		while (i < j) {
			if (nums[i] * nums[i] > nums[j] * nums[j]) {
				temp[k] = nums[i] * nums[i];
				i++;
			} else {
				temp[k] = nums[j] * nums[j];
				j--;
			}
			k--;
		}
		temp[k] = nums[i] * nums[i];
		return temp;
	}

	public static void main(String[] args) {

		int[] nums = { -4, -1, 0, 3, 10 };
		int[] nums1 = {-7,-3,2,3,11};
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(sortedSquares(nums)));
		System.out.println(Arrays.toString(sortedSquares2(nums)));
		System.out.println(Arrays.toString(sortedSquares(nums1)));
		System.out.println(Arrays.toString(sortedSquares2(nums1)));
	}
}
