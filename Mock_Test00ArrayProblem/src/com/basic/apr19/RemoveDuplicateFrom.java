package com.basic.apr19;
//From the Array using extra space

public class RemoveDuplicateFrom {
	public static int removeduplicates(int a[], int n)
	{
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		// Changing the original array
		
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}

		return j;
	}
	public static void main(String[] args)
	{
		int a[] = { 1,8,8, 1, 2,2, 2,4,4,5 };
		int n = a.length;

		n = removeduplicates(a, n);
		// Printing The array elements
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
