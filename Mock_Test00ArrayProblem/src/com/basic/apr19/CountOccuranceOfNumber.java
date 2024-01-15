package com.basic.apr19;


public class CountOccuranceOfNumber {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,4,5,};
		findOcc(arr);

	}

	private static void findOcc(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
				else
					break;				
			}
				System.out.println(arr[i]+"--->"+count);
			}
		}
		
	}

