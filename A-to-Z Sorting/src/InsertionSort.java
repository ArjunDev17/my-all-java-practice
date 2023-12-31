
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {2,5,1,3,7,4};
		int n=arr.length;
		isertSort(arr,n);
				
	}
	private static void isertSort(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				/*
				 * while(j>=0 && arr[j]>key) 
				 * if her we put arr[j]>=key 
				 * it will work but we
				 * lose Stable algorithm
				 */
				
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		display(arr,n);
	}

	private static void display(int[] arr, int n) {
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}

}
