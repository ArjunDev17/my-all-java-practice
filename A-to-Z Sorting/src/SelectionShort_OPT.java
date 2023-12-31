
public class SelectionShort_OPT {

	public static void main(String[] args) {
		int[] arr = { 2, 12, 3, 55, 6 };
		selecSortOPt(arr);
	}

	private static void selecSortOPt(int[] arr) {
		int n = arr.length;
		int temp[] = new int[n];

		for (int i = 0; i < n; i++) {
			int min = 0;
			for (int j = 1; j < n; j++)
				if (arr[j] < arr[min])
					min = j;
			swap(arr[min],arr[i]);
		
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void swap(int i, int j) {
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		
	}

}
