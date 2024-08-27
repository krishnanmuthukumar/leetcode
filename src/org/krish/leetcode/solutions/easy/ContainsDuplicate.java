package org.krish.leetcode.solutions.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problem No : 217
 * 
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1] Output: true Example 2:
 * 
 * Input: nums = [1,2,3,4] Output: false Example 3:
 * 
 * Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
 *
 */
public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (numsMap.get(nums[i]) == null) {
				numsMap.put(nums[i], nums[i]);
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int[] nums2 = { 1, 2, 3, 4 };
		int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		int[] nums4 = { 1, 1, 1, 1 };
		System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate(nums2));
		System.out.println(containsDuplicate(nums3));
		System.out.println(containsDuplicate(nums4));
	}
}
