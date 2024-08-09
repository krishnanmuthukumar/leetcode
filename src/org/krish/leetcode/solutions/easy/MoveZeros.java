package org.krish.leetcode.solutions.easy;

import java.util.Arrays;

/**
 * LeetCode Problem No : 283
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * Example 1:
 * 
 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 *
 */
public class MoveZeros {
	public static void moveZeroes(int[] nums) {
		int j = 0;
		if (nums.length > 1) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != 0) {
					nums[j] = nums[i];
					j++;
				}
			}
			for (int i = j; i < nums.length; i++) {
				if (nums[i] != 0) {
					nums[i] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		// int nums[] = { 0, 1, 0, 3, 12 };
		// 1,0,3,12,0
		// 1,3,12,0,0
		int nums[] = { 0 };
		// int nums[] = { 0, 0, 1 };
		// 0,1,0
		// int nums[] = { 1 };
		moveZeroes(nums);
	}
}
