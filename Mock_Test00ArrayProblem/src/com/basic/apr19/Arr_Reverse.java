package com.basic.apr19;

class Ar{
	void revArr(int ar1[]) {
		for(int i=0;i<=ar1.length-1;i++) {
			System.out.print(" "+ar1[i]);
		}
		System.out.println("\nReverse order");
		for(int i=ar1.length-1;i>=0;--i) {
			System.out.print(" "+ar1[i]);
		}
		
	}
}
public class Arr_Reverse {

	public static void main(String[] args) {
		int []ar= {1,2,3,4,5};
		Ar ao=new Ar();
		
		ao.revArr(ar);

	}

}
