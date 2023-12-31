
public class MergeTwoArrayEfficietWay {

	public static void main(String[] args) {
		int arr[]= {1,3,2,8,3,9};
		int arr2[]= {3,5,1,7,9,11,33};
		int n1=arr.length;
		int n2=arr2.length;
		merge(arr,arr2,n1,n2);

	}

	private static void merge(int[] a, int[] b, int n1, int n2) {
		int i=0,j=0;
		while(i<n1 && j<n2) {
			if(a[i]<=b[j]) {
				System.out.println(a[i]);
				i++;
			}else {
				System.out.println(b[j]);
				j++;
			}
		}
		while (i<n1) {
			System.out.println(a[i]);
			i++;
		}
		while (j<n2) {
			System.out.println(b[j]);
			j++;
		}
		
	}

}
