package org.krish.leetcode.solutions.easy;

/**
 * LeetCode Problem No : 1108
 * 
 * Given a valid (IPv4) IP address, return a defanged version of that IP
 * address. A defanged IP address replaces every period "." with "[.]".
 * 
 * 
 * Example 1:
 * 
 * Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1" Example 2:
 *
 */
public class DefangingIPAddress {
	public static String defangIPaddr(String address) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				strBuilder.append("[.]");
			} else {
				strBuilder.append(address.charAt(i));
			}
		}
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		// String address = "1.1.1.1";
		String address = "255.100.50.0";
		System.out.println(defangIPaddr(address));
	}
}
