
public class NaivePartion {

	public static void mai(String[] args) {
		int a[]= {1,21,12,10,31,9,8};
		int l=0;
		int n1=a.length-1;
		int p=3;//{1,2,12,}
		navParti(a,p,n1,l);
		
	}

	private static void navParti(int[] a, int p,int n1,int l) {
		int temp[]=new int[n1-l+1];
		int index=0;
		for(int i=0;i<n1;i++) {
			if(a[i]<a[p])
				temp[index++]=a[i];
		}
		for(int i=0;i<n1;i++) {
			if(a[i]>a[p])
				temp[index++]=a[i];
		}
		for(int i=0;i<index;i++) {
			System.out.println(a[i]);
		}
		
	}

}