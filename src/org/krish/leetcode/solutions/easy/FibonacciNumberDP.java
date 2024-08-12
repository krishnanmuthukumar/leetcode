package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 509
 * 
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
 * Fibonacci sequence, such that each number is the sum of the two preceding
 * ones, starting from 0 and 1. That is,
 * 
 * F(0) = 0, F(1) = 1 F(n) = F(n - 1) + F(n - 2), for n > 1. Given n, calculate
 * F(n).
 *
 */
public class FibonacciNumberDP {
	public static int fib(int n) {
		int f[] = new int[n + 2];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}

	public static void main(String[] args) {
		int n = 2;
		int n1 = 3;
		int n2 = 4;
		System.out.println(fib(n));
		System.out.println(fib(n1));
		System.out.println(fib(n2));
	}
}
