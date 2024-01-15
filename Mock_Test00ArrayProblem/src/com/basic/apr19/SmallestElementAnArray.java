package com.basic.apr19;

import java.util.Arrays;

public class SmallestElementAnArray {
	public static void main(String[] args) {
		int[]arr= {2,4,5,6,7,9,1};
		int n=arr.length;
		int min=0,max=0,min2=0;
		int temp = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
			else {
				min=arr[i];
				
			}
				
			System.out.println(min2);
			if(min<min2) {
				temp=min2;
				System.out.println(min2);
			}else {
				min2=min;
			}
			
		}
		System.out.println("Maximum :"+max);
		System.out.print("Minimum :"+min);
		System.out.print("\nsecond Minimum :"+temp);
		Arrays.sort(arr);
		System.out.println(arr[1]);
		
	}
}
