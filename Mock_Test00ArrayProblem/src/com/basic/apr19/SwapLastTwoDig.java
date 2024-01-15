package com.basic.apr19;

public class SwapLastTwoDig {

	public static void main(String[] args) {
		charPr();
		System.out.println("\n********************************");
		int[]arr= {2,4,5,6,7,9};
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		int temp=arr[n-1];
		arr[n-1]=arr[n-2];
		arr[n-2]=temp;
		System.out.println("\nSwap last dig");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void charPr() {
		char []ch= {'a','b','c','d','e','f'};
		int n=ch.length;
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]+" ");
		}
		char temp=ch[n-1];
		ch[n-1]=ch[n-2];
		ch[n-2]=temp;
		System.out.println("\nSwap last dig");
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]+" ");
		}
	}

}
