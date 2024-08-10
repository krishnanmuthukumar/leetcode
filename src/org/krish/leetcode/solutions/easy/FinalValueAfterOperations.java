package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 2011
 * 
 * There is a programming language with only four operations and one variable X:
 * 
 * ++X and X++ increments the value of the variable X by 1. --X and X--
 * decrements the value of the variable X by 1. Initially, the value of X is 0.
 * 
 * Given an array of strings operations containing a list of operations, return
 * the final value of X after performing all the operations.
 * 
 * Example 1:
 * 
 * Input: operations = ["--X","X++","X++"]
 * 
 * Output: 1
 * 
 * Explanation: The operations are performed as follows: Initially, X = 0. --X:
 * X is decremented by 1, X = 0 - 1 = -1. X++: X is incremented by 1, X = -1 + 1
 * = 0. X++: X is incremented by 1, X = 0 + 1 = 1.
 *
 */
public class FinalValueAfterOperations {
	public static int finalValueAfterOperations(String[] operations) {
		int x = 0;
		if (operations.length < 1 || operations.length > 100)
			return x;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].equalsIgnoreCase("++X") || operations[i].equalsIgnoreCase("X++")) {
				x++;
			}

			if (operations[i].equalsIgnoreCase("--X") || operations[i].equalsIgnoreCase("X--")) {
				x--;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		String[] operations = { "--X", "X++", "X++" };
		String[] operations1 = { "X++", "++X", "--X", "X--" };
		String[] operations2 = { "++X", "++X", "X++" };
		System.out.println(finalValueAfterOperations(operations));
		System.out.println(finalValueAfterOperations(operations1));
		System.out.println(finalValueAfterOperations(operations2));
	}
}
