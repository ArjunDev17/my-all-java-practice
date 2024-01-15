package com.bubblesort;

class BubbOper {
	int[] arr = { 25, 5, 20, 30 };
	int n = arr.length;

	public void getResu() {
		sortMyArr(arr, n);
	}

	private void sortMyArr(int[] arr2, int n2) {
		for (int i = 0; i < arr2.length - 1; i++) {
			
			for (int j = 0; j < arr2.length - i - 1; j++) {
				if (arr2[j] > arr2[j + 1]) {
					swap(j,j+1);
//					int temp = arr2[j];
//					arr2[j] = arr2[j + 1];
//					arr2[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n2; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

	private   void swap(int arr2, int arr22) {
		int temp = arr2;
		arr2 = arr22;
		arr22 = temp;
	}

}

public class BubbleSort {

	public static void main(String[] args) {
		BubbOper ob = new BubbOper();
		ob.getResu();

	}

}
