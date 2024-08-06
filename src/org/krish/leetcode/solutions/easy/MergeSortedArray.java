package org.krish.leetcode.solutions.easy;

import java.util.Arrays;

/**
 * LeetCode Problem No : 88
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n.
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output:
 * [1,2,2,3,5,6] Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
 * from nums1.
 *
 */

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int i = 0; i < n; i++) {
			nums1[m + i] = nums2[i];
		}

		for (int i = 1; i < nums1.length; i++) {
			int j = i - 1;
			int temp = nums1[i];

			while (j >= 0 && nums1[j] > temp) {
				nums1[j + 1] = nums1[j];
				j = j - 1;
			}

			nums1[j + 1] = temp;
		}

		System.out.println(Arrays.toString(nums1));

	}

	public static void main(String[] args) {
//		int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
//		int m = 3, n = 3;

		int[] nums1 = { 4, 5, 6, 0, 0, 0 }, nums2 = { 1, 2, 3 };
		int m = 3, n = 3;

//		int[] nums1 = { 1 }, nums2 = {  };
//		int m = 1, n = 0;
//		
//		int[] nums1 = { 0 }, nums2 = { 1 };
//		int m = 0, n = 1;

		merge(nums1, m, nums2, n);
	}

}
