package all.numbers;

import java.util.Scanner;

class An {
	public static int check(int n) {
		int squ = n * n;
		while (n > 0) {
			if (n % 10 != squ % 10) {

				return 0;

			} else {
				n = n / 10;
				squ /= 10;
			}

		}
		return 1;

	}
}

public class Automorphic_Num_in_Range {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Plzz enter Starting Number");
		int start = sc.nextInt();
		System.out.println("Plzz enter End Number");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			int s = An.check(i);
			if (s == 1) {
				System.out.println("Automorphic Number is :"+ i);
			} 
		}
	}

}
