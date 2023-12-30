package all.numbers;

import java.util.Scanner;

class B2{
	 public static void check(int n) {
		 if(n%7==0 || n%10==7) {
			 System.out.println("it is Buzz number :"+n);
		 }
	 }
 }
public class Buzz_Num_in_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plzz enter Starting Number");
		int start = sc.nextInt();
		System.out.println("Plzz enter End Number");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			B2.check(i);
		} 
		
	}
}
