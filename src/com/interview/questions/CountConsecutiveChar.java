package com.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class CountConsecutiveChar {

	public static void main(String[] args) {

		Map<Character, Integer> map = solution("aabccddghhgaacc");

		System.out.println("Output :" + map);

	}

	public static Map<Character, Integer> solution(String stringOfChar) {

		int count = 0;
		char[] chrarr = stringOfChar.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < stringOfChar.length(); i++) {

			if (i + 1 < stringOfChar.length()) {
				
				if (chrarr[i] == chrarr[i + 1]) {

					if (map.containsKey(chrarr[i])) {

						map.put(chrarr[i], map.get(chrarr[i]) + 1);
						count = 0;
					} else {
						count++;
						map.put(chrarr[i], count);
						count = 0;
					}

				}
				else {
					if (!map.containsKey(chrarr[i])) {
						
						map.put(chrarr[i], count);
						count = 0;
					}
				}
				
				
				

			}
		}

		return map;

	}

}
