package com.interview.questions;

public class UpperLowserCaseWithReverse {

	public static void main(String[] args) {
		
		String name ="Kate Winslet";
		System.out.println("Input is:"+name);
		String finalName =solution(name);
		System.out.println("Output is: "+finalName);
	}

	public static String solution(String Name) {
		
		char revArr[] = reverse(Name).toCharArray();
		
		for(int i=0;i<revArr.length;i++) {
				
			if(Character.isUpperCase(revArr[i])) {
				revArr[i]=Character.toLowerCase(revArr[i]);
			} else if(Character.isLowerCase(revArr[i])) {
				revArr[i]=Character.toUpperCase(revArr[i]);
			}
			
			
		}
		
		return new String(revArr);
	}
	
	public static String reverse(String word) {
		
		//String reverse="";
		StringBuffer input = new StringBuffer(word);
		//input.reverse();
		
		return input.reverse().toString();
		
	}
	
	
}
