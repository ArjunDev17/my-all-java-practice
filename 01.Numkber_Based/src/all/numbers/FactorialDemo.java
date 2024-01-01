package all.numbers;

public class FactorialDemo {

	public static void main(String[] args) {
		int n=4;
		fact(n);
		int t=recfact(n);
		System.out.println(t);

	}

	private static int recfact(int n) {
		if(n==0 || n==1)
			return 1;
			
		return n*recfact(n-1);
	}

	private static void fact(int n) {
		int pro=1;
		for(int i=1;i<=n;i++) {
			pro*=i;
		}
		System.out.println(pro);
		
	}

}
