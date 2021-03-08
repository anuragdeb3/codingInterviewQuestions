package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringMaintainSpaceOrder {

	public static void main(String[] args) {
		
		String sentence ="I am Anurag";
		String reverse =solution(sentence);
		System.out.println(reverse);

	}

	
	public static String solution (String sentence) {
		
		int length = sentence.length();
		char[] chr = sentence.toCharArray();
		
		for(int i=0;i<length/2;i++) {
			
			if(sentence.charAt(i)!=' ' && sentence.charAt(length-1-i)!=' ') {
				
				char temp = chr[i];
				chr[i] = chr[length-1-i];
				chr[length-1-i]=temp;
				
				
			}
			else if(sentence.charAt(i)==' ' && sentence.charAt(length-1-i)!=' ') {
				length++;
				
			}
			else if(sentence.charAt(i)!=' ' && sentence.charAt(length-1-i)==' ') {
				i--;
				
			}
			
			
			
			
			
		}
		String reverse = new String(chr);
		
		return reverse;
	}
	
}
