
public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		int a[]= {1,2,12,18,31,19};
		int b[]= {3,5,12,17,33};
		int n1=a.length;
		int n2=b.length;
		interSection(a,b,n1,n2);
	}

	private static void interSection(int[] a, int[] b, int m, int n) {
		for(int i=0;i<m;i++) {
			if(i>0 && a[i]==a[i-1])
				continue;
			for(int j=0;j<n;j++) {
				{
					if(a[i]==b[j]) {
						System.out.println(a[i]);
						break;
					}
				}
			}
		}
		//for(int i=0;i<)
	}
}
