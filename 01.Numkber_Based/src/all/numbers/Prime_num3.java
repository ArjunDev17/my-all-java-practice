package all.numbers;

import java.util.Scanner;



class P33{
	static int c=0;
	public static boolean check(int n) {
		if(n==1) 
			return false;
		if(n==2 || n==3) 
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
			if(n%i==0||n%(i+2)==0) 
				return false;
			return true;
	}
}

public class Prime_num3 {

	public static void main(String[] args) {
		System.out.println("Plzz enter numnber for check ");
		Scanner so=new Scanner(System.in);
		int n=so.nextInt();
		
		boolean b=P1.check(n);
		System.out.print(n+" is it Prime :->"+b);
	}

}
