package com.sorting.quic.sort;

public class QuicSortDemo {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 8, 1 };
		int start = 0;
		int end = arr.length - 1;
		
		quickSort(arr, start, end);
		
		for (int x : arr) {
			System.out.print(" " + x);
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int i = start;
		int j = end;
		int pivote = arr[(start + end) / 2];
		while (arr[i] < pivote)
			i++;
		while (arr[j] > pivote)
			j--;
		if (i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		i++;
		j--;

		quickSort(arr, start, j);
		quickSort(arr, i, end);

	}
}
