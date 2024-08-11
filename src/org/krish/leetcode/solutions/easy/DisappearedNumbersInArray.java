package org.krish.leetcode.solutions.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode Problem No : 448
 * 
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in
 * nums.
 * 
 * Example 1:
 * 
 * Input: nums = [4,3,2,7,8,2,3,1] Output: [5,6]
 *
 */
public class DisappearedNumbersInArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (numbersMap.get(nums[i]) == null) {
				numbersMap.put(nums[i], nums[i]);
			}
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (!numbersMap.containsKey(i + 1)) {
				result.add(i + 1);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int[] nums = { 1, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}
}
