package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1678
 * 
 * You own a Goal Parser that can interpret a string command. The command
 * consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal
 * Parser will interpret "G" as the string "G", "()" as the string "o", and
 * "(al)" as the string "al". The interpreted strings are then concatenated in
 * the original order.
 * 
 * Given the string command, return the Goal Parser's interpretation of command.
 * 
 * Example 1:
 * 
 * Input: command = "G()(al)" Output: "Goal" Explanation: The Goal Parser
 * interprets the command as follows: G -> G () -> o (al) -> al The final
 * concatenated result is "Goal".
 *
 */
public class GoalParser {
	public static String interpret(String command) {
		StringBuilder sb = new StringBuilder();
		char[] c = command.toCharArray();
		for (int i = 0; i <= c.length - 1; i++) {
			if (c[i] == 'G') {
				sb.append(c[i]);
				continue;
			}
			if (c[i] == '(' && c[i + 1] == ')') {
				sb.append('o');
				i++;
				continue;
			}
			if (c[i] == '(' && c[i + 1] == 'a' && c[i + 2] == 'l' && c[i + 3] == ')') {
				sb.append(c[i + 1]).append(c[i + 2]);
				i = i + 3;
				continue;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String command = "G()(al)";
		String command1 = "G()()()()(al)";
		String command2 = "(al)G(al)()()G";
		System.out.println(interpret(command));
		System.out.println(interpret(command1));
		System.out.println(interpret(command2));
	}
}
