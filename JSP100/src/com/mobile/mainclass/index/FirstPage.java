package com.mobile.mainclass.index;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FirstPage {
	 static Scanner so=new Scanner(System.in);
	public void display_Index() { 
		String str=FirstPage.getUserName();
		System.out.println("*****************************************");
		System.out.println("Welcome :--> "+str);
		System.out.println("Now your system is login as :"+str);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		   System.out.println("*****************************************");
		  
	}

	private static String getUserName() {
		String user_Name=signUP();
		return user_Name;
	}

	private static String signUP() {
		System.out.println("Please Enter Your name :");
		String name=so.next();
		
		return name;
	}

}
