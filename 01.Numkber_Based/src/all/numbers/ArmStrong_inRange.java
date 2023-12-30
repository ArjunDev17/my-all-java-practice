package all.numbers;


import java.util.Scanner;

class A2{
	public static void Arm(int n) {
		int temp=n;
		int count=find_dig(n);
		
		int sum=0;
		while(n>0) {
			int fact=1;
			int re=n%10;
			for(int i=1;i<=count;i++) {
				fact*=re;
			}
			sum+=fact;
			n/=10;
		}
		
		if(sum==temp) {
			System.out.println("ArmStrong :"+sum);
		}
	}
		private static int find_dig(int n) {
		
			int n1=0;
			while(n>0) {
				n1++;
				n/=10;
				}
		return n1;
	}
		
}

public class ArmStrong_inRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plzz enter starting and ending point");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			A2.Arm(i);
		}
		
		
	}
	

}

