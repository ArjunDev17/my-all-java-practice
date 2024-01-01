package diffrent.level.program;

public class RotationOfArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		int k=3;
		rotateArr(arr,k);
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

	private static void rotateArr(int[] arr, int k) {
		k=k%arr.length;
		if(k<0) {
			k=k+arr.length;
		}
		for(int i=1;i<=k;i++) {
			rotateArr(arr);
		}
	}
	private static void rotateArr(int[] arr) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		
	}

}
