import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int arr[]= {1,3,2,8,3,9};
		int arr2[]= {3,5,1,7,9,11,33};
		int n1=arr.length;
		int n2=arr2.length;
		merge(arr,arr2,n1,n2);

	}

	private static void merge(int[] arr, int[] arr2, int n1, int n2) {
		int n3=n1+n2;
		int[] arr3=new int[n3];
		for(int i=0;i<n1;i++) {
			arr3[i]=arr[i];
		}
		for(int i=0;i<n2;i++) {
			arr3[n1+i]=arr2[i];
		}
		Arrays.sort(arr3);
		for(int i=0;i<n3;i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}

}
