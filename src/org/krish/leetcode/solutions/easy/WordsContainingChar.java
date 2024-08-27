package org.krish.leetcode.solutions.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Problem No : 2942
 * 
 * You are given a 0-indexed array of strings words and a character x.
 * 
 * Return an array of indices representing the words that contain the character
 * x.
 * 
 * Note that the returned array may be in any order.
 * 
 * Example 1:
 * 
 * Input: words = ["leet","code"], x = "e" Output: [0,1] Explanation: "e" occurs
 * in both words: "leet", and "code". Hence, we return indices 0 and 1.
 *
 */
public class WordsContainingChar {
	public static List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			innerloop: for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) == x) {
					res.add(i);
					break innerloop;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		String words[] = { "leet", "code" };
		char x = 'e';
		List<Integer> result = findWordsContaining(words, x);
		result.forEach(c -> System.out.print(c));
	}
}
