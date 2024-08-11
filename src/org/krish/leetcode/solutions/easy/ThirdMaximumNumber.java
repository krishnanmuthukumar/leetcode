package org.krish.leetcode.solutions.easy;

import java.util.Arrays;

/**
 * LeetCode Problem No : 414
 * 
 * Given an integer array nums, return the third distinct maximum number in this
 * array. If the third maximum does not exist, return the maximum number.
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,1]
 * 
 * Output: 1 Explanation: The first distinct maximum is 3. The second distinct
 * maximum is 2. The third distinct maximum is 1.
 *
 */
public class ThirdMaximumNumber {
	public static int thirdMax(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int j = i - 1;
			int temp = nums[i];
			while (j >= 0 && nums[j] < temp) {
				nums[j + 1] = nums[j];
				j = j - 1;
			}
			nums[j + 1] = temp;
		}
		System.out.println(Arrays.toString(nums));
		int uq[] = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				uq[j++] = nums[i];
			}
		}
		uq[j++] = nums[nums.length - 1];
		System.out.println("j:" + j);
		System.out.println(Arrays.toString(uq));
		if (j < 3) {
			return uq[0];
		} else {
			return uq[2];
		}
	}

	public static void main(String[] args) {
		int nums[] = { 3, 2, 1 };
		// int nums[] = { 1, 2 };
		// int nums[] = { 2, 2, 3, 1 };
		// int nums[] = { 5, 2, 2 };
		// int nums[] = {1,2,2,5,3,5};
		System.out.println(thirdMax(nums));
	}
}
