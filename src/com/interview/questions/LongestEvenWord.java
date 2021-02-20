package com.interview.questions;

public class LongestEvenWord {

	public static void main(String[] args) {
		

		String sentence =	"This is Pleasant Work "	;
				
		System.out.println("Original Sentance : "+sentence);
		System.out.println("longest Even Word:"+ longestEvenWord(sentence));
	}

	public static String longestEvenWord(String Name) {
		
		int largest=0;
		String largeStr="";
		
		String arr[] = Name.split(" ");
		for(int i=0;i<arr.length;i++) {
			
			//System.out.println(largest);
			//System.out.println(arr[i]);
			if(arr[i].length() % 2 == 0) {
				int length = arr[i].length();
				if(length > largest) {
					largeStr = arr[i];
					largest = length;
					
				}
				
				
			}
			else {
				largeStr="00";
			}
			
		}
		
		
		
		
		
		
		return largeStr;
		
	}
	
	
	
}
