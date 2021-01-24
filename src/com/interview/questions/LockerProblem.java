package com.interview.questions;

public class LockerProblem {

	public static void main(String[] args) {

		String startState = "2345";
		String endState = "5432";

		String deadlock[] = { "113", "213", "413" };

		int count = solution(startState, endState, deadlock);
		System.out.println("Count :" + count);

		int countMethod2 = solution2(startState, endState, deadlock);
		System.out.println("Count :" + count);

	}

	public static int solution(String startState, String endState, String deallock[]) {

		System.out.println("first Solution");
		int startVal = 0, endVal = 0;
		int length = startState.length();
		int count = 0;
		int i = 0;
		// 123->223 ->323 ->
		System.out.println(startState + " ---" + endState);
		char[] start = startState.toCharArray();
		char[] end = endState.toCharArray();

		while (i < length) {

			startVal = Character.getNumericValue(start[i]);
			endVal = Character.getNumericValue(end[i]);
			while (startVal != endVal) {

				if (startVal > endVal) {
					startVal--;
					start[i] = Character.forDigit(startVal, 10);
				} else if (startVal < endVal) {
					startVal++;
					start[i] = Character.forDigit(startVal, 10);
				}

				printChar(start);
				System.out.println("");
				count++;

			}

			i++;

		}
		return count;
	}

	static char[] printChar(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		return arr;
	}

	static void compareWithDeadlock() {

	}

	public static int solution2(String startState1, String endState1, String deallock[]) {

		System.out.println("Second Solution");
		int startState = Integer.parseInt(startState1);
		int endState = Integer.parseInt(endState1);
		int startVal = 0, endVal = 0;
		int rotation = 0;

		while (startState > 0 || endState > 0) {

			System.out.println(startState + " ini " + endState);
			startVal = startState % 10;
			endVal = endState % 10;

			rotation += Math.min(Math.abs(startVal - endVal), 10 - Math.abs(startVal - endVal));

			System.out.println(startVal + ": mod :" + endVal + " rot " + rotation);

			startState /= 10;
			endState /= 10;
			System.out.println("--------------");
		}

		System.out.println("rotation: " + rotation);

		return rotation;
	}
}
