package com.basic.apr19;

import java.util.Scanner;

public class AddEveandOdd {

	public static void main(String[] args) {
		
		Scanner so=new Scanner(System.in);
		int eveSum=0;
		int oddSum=0;
		System.out.println("Please enter zize of the array");
		int n=so.nextInt();
		int[] arr=new int[n];
		System.out.println("enter your data :");
		for(int i=0;i<n;i++) {
			arr[i]=so.nextInt();
		}
		System.out.println("Your Array is :");
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				eveSum+=arr[i];
			}else {
				oddSum+=arr[i];
			}
		}
		System.out.println("Sum of even number :"+eveSum);
		System.out.println("Sum of Odd number :"+oddSum);
		
	}
	
}
