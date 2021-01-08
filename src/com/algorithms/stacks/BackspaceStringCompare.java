package com.algorithms.stacks;

import java.util.Stack;

public class BackspaceStringCompare {
	
	public static void main(String[] args) {
		System.out.println(new BackspaceStringCompare().backspaceCompare("ab#","ac#"));
	}

	public boolean backspaceCompare(String S, String T) {

		Stack<Character> s = getCharacterStack(S);
		Stack<Character> t = getCharacterStack(T);

		StringBuilder _s = new StringBuilder();
		StringBuilder _t = new StringBuilder();

		while (!s.empty()) {
			_s.append(s.pop());
		}

		while (!t.empty()) {
			_t.append(t.pop());
		}
		return _s.toString().equals(_t.toString());

	}

	public Stack<Character> getCharacterStack(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (Character ch : s.toCharArray()) {
			if (!stack.empty() && ch == '#') {
				stack.pop();
			} else if (stack.empty() && ch == '#') {
				// Do nothing
			} else {
				stack.push(ch);
			}
		}
		return stack;
	}

}
