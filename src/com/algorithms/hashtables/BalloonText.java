package com.algorithms.hashtables;

import java.util.HashMap;

public class BalloonText {
	public static void main(String[] args) {
		maxNumberOfBalloons("leetcode");
	}

	public static int maxNumberOfBalloons(String text) {
		int result = 0;
		HashMap<Character, Integer> balloon = new HashMap<Character, Integer>();
		HashMap<Character, Integer> balloonText = new HashMap<Character, Integer>();

		for (Character ch : "balloon".toCharArray()) {
			balloon.put(ch, balloon.getOrDefault(ch, 0) + 1);
		}
		for (Character ch1 : text.toCharArray()) {
			balloonText.put(ch1, balloonText.getOrDefault(ch1, 0) + 1);
		}

		for (int i = 1;; i++) {
			if (balloon.get('b') * i <= balloonText.getOrDefault('b',0) 
					&& balloon.get('a') * i <= balloonText.getOrDefault('a',0)
					&& balloon.get('l') * i <= balloonText.getOrDefault('l',0) 
					&& balloon.get('o') * i <= balloonText.getOrDefault('o',0)
					&& balloon.get('n') * i <= balloonText.getOrDefault('n',0)) {
				result++;
			} else {
				break;
			}
		}
		return result;
	}

}
