package com.algorithms.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given words first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.
//
//For each such occurrence, add "third" to the answer, and return the answer.
//
// 
//
//Example 1:
//
//Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
//Output: ["girl","student"]
//Example 2:
//
//Input: text = "we will we will rock you", first = "we", second = "will"
//Output: ["we","rock"]
//"jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa"
//"kcyxdfnoa"
//"jkypmsxd"

public class OccurencesAfterBiagram {

	public static void main(String[] args) {

		findOcurrences("jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa",
				"kcyxdfnoa", "jkypmsxd");

	}

	public static String[] findOcurrences(String text, String first, String second) {
		List<String> outputList = new ArrayList<String>();
		String[] output = null;

		String splitText[] = text.split(" ");

		for (int i = 0; i < splitText.length - 2; i++) {

			if (splitText[i].equalsIgnoreCase(first) && splitText[i + 1].equalsIgnoreCase(second)) {
				outputList.add(splitText[i + 2]);
			}
		}

		output = new String[outputList.size()];
		output = outputList.toArray(output);

		return output;

	}

}
