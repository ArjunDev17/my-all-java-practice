package com.paatern.progr;

public class p1 {

	public static void main(String[] args) {
		printPat(5);
		printPat1(5);

	}

	private static void printPat1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	*
//	**
//	***
//	****
	

	private static void printPat(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		*****
//		*****
//		*****
//		*****
//		*****
	}
	
	

}
