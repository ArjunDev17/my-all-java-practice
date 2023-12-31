package com.searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[]arr= {2,12,4,6,9,8};
		Arrays.sort(arr);
		int l=0;
		int h=arr.length;
		int value=BinarySerch(arr,l,h,2);
		if(value>=0)
			System.out.println("ELement find at index :"+value);
		else
		  System.out.println("ELement Not foundn");
	}
	private static int BinarySerch(int[] arr, int l, int h, int i) {
		while(l<h) {
			int mid=(l+h)/2;
			if(arr[mid]==i)return mid;
			if(arr[mid]>i)h=mid-1;
			if(arr[mid]<i)l=mid+1;
		}
		return 0;
	}
}
