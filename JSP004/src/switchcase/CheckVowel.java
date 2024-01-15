package switchcase;

import java.util.Scanner;

class Cultural{
	Scanner so=new Scanner(System.in);
}

public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		System.out.println("Check it is ");
		String str="ram";
		char choice=so.next().charAt(0);
		switch(str) {
		case "ram":
			break;
		case "":		
			System.out.println("It is Vowel");
		default:
			System.out.println("Choice is not good");
		}

	}

}
