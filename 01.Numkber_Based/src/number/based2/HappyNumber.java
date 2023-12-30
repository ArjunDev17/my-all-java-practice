package number.based2;

import java.util.Scanner;

class Hn {
	static boolean isHappynumber(int n) {
		if (n == 1 || n == 7)
			return true;
		int sum = n, x = n;
		while (sum > 9) {
			sum = 0;
			// sum of square of digits
			while (x > 0) {
				int d = x % 10;
				sum += d * d;
				x /= 10;
			}
			if (sum == 1)
				return true;
			x = sum;
		}
		if (sum == 7)
			return true;
		return false;
	}
}
public class HappyNumber {
	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		System.out.println("Arjun , Please enter the digit :");
		int n = so.nextInt();
		if (Hn.isHappynumber(n))
			System.out.println(n + " is a Happy number");
		else
			System.out.println(n + " is not a Happy number");
	}
}
