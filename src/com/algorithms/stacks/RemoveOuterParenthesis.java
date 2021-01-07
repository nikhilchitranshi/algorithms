package com.algorithms.stacks;

import java.util.Stack;

/*
A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

 

Example 1:

Input: "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
*/

public class RemoveOuterParenthesis {
	
	public static void main(String[] args) {
		new RemoveOuterParenthesis().removeOuterParentheses("(()())(())");
	}

	public String removeOuterParentheses(String S) {
		StringBuilder result = new StringBuilder();
		int parenthesis = 0;
		int from = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(')
				parenthesis++;
			else
				parenthesis--;

			if (parenthesis == 0) {
				result.append(S.substring(from + 1, i));
				from = i + 1;
			}
		}
		return result.toString();
	}

	public String removeOuterParenthesesUsingStack(String S) {

		StringBuilder result = new StringBuilder();
		StringBuilder currentString = new StringBuilder();
		Stack<String> brackets = new Stack<String>();

		for (int i = 0; i < S.length(); i++) {

			if (S.charAt(i) == '(') {
				brackets.push("(");
			} else {
				brackets.pop();
			}

			currentString.append(S.charAt(i));

			if (brackets.empty()) {
				result.append(currentString.substring(1, currentString.length() - 1));
				currentString = new StringBuilder();
			}
		}
		return result.toString();
	}

}
