package com.searching;

public class LinearSearch {
	public static void main(String[] args) {
		int[]arr= {2,12,4,6,9,8};
		int value=linearSerch(arr,4);
		if(value>0)
			System.out.println("ELement find at index :"+value);
		else
		  System.out.println("ELement Not foundn");
	}

	private static int linearSerch(int[] arr,int se) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==se)return i;
		}
		return 0;
	}
}
