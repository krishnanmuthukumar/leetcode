package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 2413
 * 
 * Given a positive integer n, return the smallest positive integer that is a
 * multiple of both 2 and n.
 * 
 * 
 * Example 1:
 * 
 * Input: n = 5 Output: 10 Explanation: The smallest multiple of both 5 and 2 is
 * 10.
 *
 */
public class SmallestEventMultiple {
	public static int smallestEvenMultiple(int n) {
		int i = 1;
		while (true) {
			int multple = (n * i);
			if (multple % 2 == 0) {
				return multple;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int n1 = 6;
		int n2 = 4;
		int n3 = 3;
		int n4 = 2;
		System.out.println(smallestEvenMultiple(n));
		System.out.println(smallestEvenMultiple(n1));
		System.out.println(smallestEvenMultiple(n2));
		System.out.println(smallestEvenMultiple(n3));
		System.out.println(smallestEvenMultiple(n4));
	}
}
