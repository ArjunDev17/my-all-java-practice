
public class SelectionShort {

	

	public static void main(String[] args) {
		int[] arr= {2,12,3,155,6};
		selecSort(arr);

	}

	private static void selecSort(int[] arr) {
		int n=arr.length;
		int temp[] =new int[n];
		
		
		for(int i=0;i<n;i++) {
			int min=0;
			for(int j=1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp[i]=arr[min];
			//System.out.println(temp[i]);		
			
			arr[min]=Integer.MAX_VALUE;	
		}
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
			//System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
