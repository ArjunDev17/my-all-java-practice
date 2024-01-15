package com.basic.apr19;

import java.util.HashMap;

public class RepeatedElementAnArray {
 
	public static void main(String[] args) {
	
		int ar[]= {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		cp(ar);
	}

	private static void cp(int []arr) {
		//int[] arr = { 1, 2, 3, 4, 1, 2, 3, 1, 2, 1 };
		
	    HashMap<Integer, Integer> counts = new HashMap<>();    
	    //iterate over the array and update the counts in the HashMap
		for(int i = 0;i<arr.length;i++)
		{
			int num = arr[i];
			if (counts.containsKey(num)) {
				counts.put(num, counts.get(num) + 1);
			} else {
				counts.put(num, 1);
			}
		}
	//iterate over the HashMap and print out the counts
		for(int num:counts.keySet()){
			int count = counts.get(num);
			System.out.println(num + " occurs " + count + " times in the array");
		}
	}
}
