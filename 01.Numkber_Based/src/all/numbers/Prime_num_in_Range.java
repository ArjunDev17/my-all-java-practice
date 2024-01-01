package all.numbers;

import java.util.Scanner;

class P4{
	static int c=0;
	public static int check(int n) {
		if(n==1) 
			return 0;
		if(n==2 || n==3) 
			return n;
		if(n%2==0 || n%3==0)
			return 0;
		for(int i=5;i*i<=n;i=i+6)
			if(n%i==0||n%(i+2)==0) 
				continue;;
			return n;
	}
}

public class Prime_num_in_Range {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Plzz enter starting point");
		int start=sc.nextInt();
		System.out.println("Plzz enter ending point check ");
		int end=sc.nextInt();
		System.out.println("Prime number is :-> ");
		for(int i=start;i<=end;i++) {
		int k=P4.check(i);
		if(k>0) {
			System.out.println(k);
		}
		
		}
		
	}

}
