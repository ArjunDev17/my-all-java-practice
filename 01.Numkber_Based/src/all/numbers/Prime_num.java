package all.numbers;

import java.util.Scanner;



class P1{
	static int c=0;
	public static boolean check(int n) {
		if(n==1) 
			return false;
		
		for(int i=2;i*i<n;i++)
			if(n%i==0) 
				return false;
			return true;
	}
}

public class Prime_num {

	public static void main(String[] args) {
		System.out.println("Plzz enter numnber for check ");
		Scanner so=new Scanner(System.in);
		int n=so.nextInt();
		
		boolean b=P1.check(n);
		System.out.print(n+"is it Prime :->"+b);
	}

}
