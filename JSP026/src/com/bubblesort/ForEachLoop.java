package com.bubblesort;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[]= {2,5,1,7};
		for(int x:arr) {
			int n=arr.length;
			int c=0;
			++c;
			if(n/2==c)
				break;
			System.out.println("********************");
			System.out.println(c);
			System.out.println("********************");
			System.out.println(n);
			System.out.println("********************");
			
			System.out.print(x+" ");
		}
		

	}

}
