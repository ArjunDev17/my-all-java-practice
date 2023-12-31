package first.mayM;

public class QuicSort {

	public static void main(String[] args) {
		int arr[]= {1,3,41,2,3};
		int l=0;
		int h=arr.length-1;
		quicSort(arr,l,h);
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void quicSort(int[] arr, int l, int h) {
		if(l<h) {
			int p=partion(arr,l,h);
			quicSort(arr,l,p);
			quicSort(arr,p+1,h);
		}
		
	}

	private static int partion(int[] arr, int low, int high) {
		   int pivot = arr[low];
	        int i = low - 1;
	        int j = high + 1;
	        while (true) {
	            do {
	                i++;
	            } while (arr[i] < pivot);
	            do {
	                j--;
	            } while (arr[j] > pivot);
	            if (i >= j) {
	                return j;
	            }
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	

}
}