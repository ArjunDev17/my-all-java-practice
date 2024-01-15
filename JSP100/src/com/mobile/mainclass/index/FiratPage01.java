package com.mobile.mainclass.index;

import java.util.Scanner;

public class FiratPage01 {
	public void menuList() {
		int c=0;
		Scanner so=new Scanner(System.in);
		do {
			System.out.println("Calling...");
			System.out.println("Browser...");
			System.out.println("Camera...");
			System.out.println("Messages...");
			System.out.println("Contact List...");
			System.out.println("Want to exit From Second Screen");
			c=so.nextInt();
		}while(c==0);
	}
	

}
