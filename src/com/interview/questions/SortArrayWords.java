package com.interview.questions;

public class SortArrayWords {

	public static void main(String[] args) {
		String sentence = "This is new Surprise";
		Solution(sentence);

	}
	
	public static void Solution(String sentence) {
		
	        
	      String [] strArr =sentence.split(" ");
	      int length1 = strArr.length;
	      
	      for(int i=0;i<length1-1;i++) {
	 
	    		//System.out.println("Before: "+strArr[i]+"=="+strArr[i+1]);
	    	  if(strArr[i].length() < strArr[i+1].length()) {
	    		  
	    		  String temp = strArr[i];
	    		  strArr[i] = strArr[i+1];
	    		  strArr[i+1] = temp;
	    		//  System.out.println("After: "+strArr[i]+"=="+strArr[i+1]);  
	        	   
	    		 i=-1;   		  
	    	  }
	    	  
	    	 
	    	  
	      }
	      
	      
	      for(int i=0;i<strArr.length;i++) {
	    	  System.out.println(strArr[i]);
	      }
		
		
	}
	
	

}
