package com.algorithms.string;

//You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
//
//Given the string command, return the Goal Parser's interpretation of command.
//		
//Example 1:
//
//Input: command = "G()(al)"
//Output: "Goal"
//Explanation: The Goal Parser interprets the command as follows:
//G -> G
//() -> o
//(al) -> al
//The final concatenated result is "Goal".

public class GoalParser {

	public String interpret(String command) {

		char[] charArray = command.toCharArray();
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < charArray.length;) {

			if (charArray[i] == 'G') {
				output.append("G");
				i++;

			} else if (charArray[i] == '(' && charArray[i + 1] == ')') {
				output.append("o");
				i = i + 2;

			} else if (charArray[i] == '(' && charArray[i + 1] == 'a' && charArray[i + 2] == 'l'
					&& charArray[i + 3] == ')') {
				output.append("al");
				i = i + 4;
			}

		}
		return output.toString();

	}

}
