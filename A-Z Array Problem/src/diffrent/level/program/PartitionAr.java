package diffrent.level.program;

public class PartitionAr {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int k=3;
		reverseAr(arr,0,k-1);
		reverseAr(arr,k,arr.length-1);
	}

	private static void reverseAr(int[] arr, int s,int k) {
		int []left=new int[k];
		int j=0;
		for(int i=k-1;i>=0;i-- ) {
			left[j++]=arr[i];
		}
		for(int x:left) {
			System.out.print(x+" ");
		}
		
	}
}
