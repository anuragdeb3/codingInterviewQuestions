package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

/*

Saurab believes that any integer of the form A^x + B^y makes him angry.
So, he gives you an integer array X of size N.
For each X[i], you have to find count f angry integers less than X[i];

Input format
N  denotes the size of array
integer A
integer B
line of input contains an integer array X of size N.


Output
For each X[i], output the count of angry integers less than X[i] on a new line.

Sample input 
3
10
3
2  4  11

Output
0
1
3

Constraints
1<=N=100000
1<=A,B<=1000
1<=X[i]<2^31
0<=0 x,y

*/


public class AngryInteger {

	public static void main(String[] args) {
		
		
		long arr[] ={2,4,11};
		long A=10;
		long B=3;
		long N=3;
		long [] solutionArr =solve(arr,N,A,B);
		printarrLong(solutionArr);
	}

	static void printarrLong(long arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	
static long[] solve(long arr[], long length, long A, long B) {
	
	    long countArr[]= new long[(int) length];
	    int countIndex=0;
	    long countValue=0;
	    
		List <Long> sumA =new ArrayList<>();
		List <Long> sumB =new ArrayList<>();
		
	for (int index=0;index<arr.length;index++){	
		for (int i=0;i<arr[index];i++){
		    sumA.add((long)Math.pow(A,i));
		    sumB.add((long)Math.pow(B,i));
		}
	
	countValue = getcount(sumA, sumB, arr[index]);
	//System.out.println(countValue+" "+countIndex);
	countArr[countIndex]=countValue;
	countIndex++;
	    sumA.clear();
	    sumB.clear();
	
	}
return countArr;

}	
	
	static long getcount(List<Long> A, List<Long>B, long num){	

        long count=0;
        long temp=0;
        for (int i=0;i<A.size();i++){
            for(int j=0;j<B.size();j++){
                
                    temp=A.get(i)+B.get(j);
                    if (temp<num && temp >=0){
                        count++;
                    }
           }
        }
   	return count;
	}	

}

