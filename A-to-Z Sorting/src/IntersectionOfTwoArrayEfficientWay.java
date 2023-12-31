
public class IntersectionOfTwoArrayEfficientWay {

	public static void main(String[] args) {
		int a[]= {1,2,12,18,31,19};
		int b[]= {3,5,12,17,33};
		int n1=a.length;
		int n2=b.length;
		interSection(a,b,n1,n2);

	}

	private static void interSection(int[] a, int[] b, int m, int n) {
		int i=0,j=0;
		while (i<m && j<n) {
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;				
			}
			if(a[i]<b[j])i++;
			else if(a[i]>b[j])j++;
			else {
				System.out.println(a[i]);
				i++;j++;
			}
				
		}
		
	}

}
