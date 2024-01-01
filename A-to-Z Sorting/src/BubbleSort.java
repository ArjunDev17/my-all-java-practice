import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {2,12,3,55,6};
		bubblesort(arr);

	}

	private static void bubblesort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
