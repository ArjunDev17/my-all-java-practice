package com.basic.apr19;

public class Pro5 {

	public static void main(String[] args) {
		int a[] = { 1, 2,4,4,5 };
		
		int n = a.length;
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++) {
			if(a[i]==1||a[i]==2) {
				a[i]=a[i]*10;
			}
			else {
				a[i]=10;
			}
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
