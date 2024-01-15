package number.related;

public class armstr {

	public static void main(String[] args) {
		int r=arm(153);
		System.out.println(r);
	}
	public static int arm(int num) {
		int c=count(num);
		
		int add=0;
		while(num>0) {
			int sum=1;
			int rem=num%10;
			for(int i=0;i<c;i++) {
				sum*=rem;
			}
			add+=sum;
			num=num/10;
		}
		return add;
	}
	private static int count(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum++;
			num=num/10;
		}
		return sum;
	
	}
}
