package org.krish.leetcode.solutions.easy;

import java.util.Arrays;

/**
 * LeetCode Problem No : 242
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram" Output: true
 *
 */
public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		char[] charArrS = s.toCharArray();
		char[] charArrT = t.toCharArray();
		Arrays.sort(charArrS);
		Arrays.sort(charArrT);
		return Arrays.equals(charArrS, charArrT) ? true : false;
	}

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		String s1 = "rat", t1 = "car";
		System.out.println(isAnagram(s, t));
		System.out.println(isAnagram(s1, t1));
	}
}
