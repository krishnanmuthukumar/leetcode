package org.krish.leetcode.solutions.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Problem No : 155
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * Implement the MinStack class:
 * 
 * MinStack() initializes the stack object. void push(int val) pushes the
 * element val onto the stack. void pop() removes the element on the top of the
 * stack. int top() gets the top element of the stack. int getMin() retrieves
 * the minimum element in the stack. You must implement a solution with O(1)
 * time complexity for each function.
 * 
 * Example 1:
 * 
 * Input ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 
 * Output [null,null,null,null,-3,null,0,-2]
 *
 */
public class MinStackTest {
	public static void main(String[] args) {
		MinStack st = new MinStack();
		st.push(-2);
		st.push(0);
		st.push(-3);
		System.out.println(st.getMin());
		st.pop();
		System.out.println(st.top());
		System.out.println(st.getMin());
	}
}


class MinStack {
	private List<Integer> list;

	public MinStack() {
		list = new ArrayList<Integer>();
	}

	public void push(int val) {
		list.add(val);
	}

	public void pop() {
		if (list.size() > 0) {
			list.remove(list.size() - 1);
		}
	}

	public int top() {
		return list.get(list.size() - 1);

	}

	public int getMin() {
		int min = list.get(0);
		for (int j = 1; j < list.size(); j++) {
			if (min > list.get(j))
				min = list.get(j);
		}
		return min;
	}
}

