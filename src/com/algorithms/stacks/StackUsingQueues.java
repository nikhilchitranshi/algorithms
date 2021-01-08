package com.algorithms.stacks;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueues {

}

class MyStack {

	/** Initialize your data structure here. */

	Queue<Integer> stack;
	Queue<Integer> aux;

	public MyStack() {
		stack = new ArrayDeque<>();
		aux = new ArrayDeque<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {

		while (!stack.isEmpty()) {
			aux.add(stack.remove());
		}
		stack.add(x);

		while (!aux.isEmpty()) {
			stack.add(aux.remove());
		}

	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		return stack.remove();
	}

	/** Get the top element. */
	public int top() {
		return stack.peek();
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return stack.isEmpty();
	}
}
