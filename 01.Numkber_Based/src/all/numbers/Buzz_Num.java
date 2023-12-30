package all.numbers;

import java.util.Scanner;

class B1{
	 public static void check(int n) {
		 if(n%7==0 || n%10==7) {
			 System.out.println("it is Buzz number :"+n);
		 }
	 }
 }
public class Buzz_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Plzz enter Starting Number");
		int start = sc.nextInt();
		B1.check(start);

	}

}
