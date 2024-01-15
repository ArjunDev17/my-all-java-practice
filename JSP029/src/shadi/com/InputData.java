package shadi.com;

import java.util.Scanner;

public class InputData {
	public void inputData() {
		Scanner so = new Scanner(System.in);

		System.out.println("Plzz enter your age  for check your elegblr");
		int age = so.nextInt();
		if (age > 21) {
			System.out.println("Enter your name");
		}
	}
}
