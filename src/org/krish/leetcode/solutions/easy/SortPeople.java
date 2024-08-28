package org.krish.leetcode.solutions.easy;

import java.util.Arrays;

/**
 * LeetCode Problem No : 2418
 * 
 * You are given an array of strings names, and an array heights that consists
 * of distinct positive integers. Both arrays are of length n.
 * 
 * For each index i, names[i] and heights[i] denote the name and height of the
 * ith person.
 * 
 * Return names sorted in descending order by the people's heights.
 * 
 * Example 1:
 * 
 * Input: names = ["Mary","John","Emma"], heights = [180,165,170] Output:
 * ["Mary","Emma","John"] Explanation: Mary is the tallest, followed by Emma and
 * John.
 *
 */
public class SortPeople {
	public static String[] sortPeople(String[] names, int[] heights) {
		for (int i = 0; i < heights.length; i++) {
			for (int j = i + 1; j < heights.length; j++) {
				if (heights[i] < heights[j]) {
					int temp = heights[i];
					String temp1 = names[i];
					heights[i] = heights[j];
					names[i] = names[j];
					heights[j] = temp;
					names[j] = temp1;
				}
			}
		}
		return names;
	}

	public static void main(String[] args) {
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		String[] names1 = { "Alice", "Bob", "Bob" };
		int[] heights1 = { 155, 185, 150 };
		System.out.println(Arrays.toString(sortPeople(names, heights)));
		System.out.println(Arrays.toString(sortPeople(names1, heights1)));
	}
}
