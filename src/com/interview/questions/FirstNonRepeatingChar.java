package com.interview.questions;

import java.util.HashMap;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
	
		String str = "anururgagnqaaaaa";
		int index = solution(str);
		
		System.out.println(index==-1?"No unique char":"1st Non repeat Char is:"+str.charAt(index));
	}

	private static int solution(String str) {
		
		final int nochar=256;
		char count[] = new char[nochar];
		
		for(int i=0;i<str.length();i++) 
				count[str.charAt(i)]++;
			
		int index =-1;
		
		for(int ctr=0;ctr<str.length();ctr++) {
			if(count[str.charAt(ctr)]==1) {
				index=ctr;
				break;
			}
		}
		
	return index;
	
	
	}

}
