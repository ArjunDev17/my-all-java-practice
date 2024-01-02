package mobile.sim;

import java.util.Scanner;


class Phone{
	String brand;
	Airtel1 aitel;
	Jio1 jio;
	Battery1 battery;
	public Phone(String brand, Battery1 battery) {
		
		this.brand = brand;
			
		this.battery = battery;
	}	
	public void call() {
		Scanner so=new Scanner(System.in);
		System.out.println("Choce your sim");
		System.out.println("1. Airtel\n2.Jio");
		int select=so.nextInt();
		if(select==1) {
			Airtel1 aitel=new Airtel1("Airtel");
			aitel.calling();
		}
		else if(select==2) {
			Jio1 jo=new Jio1("Jio");
			jo.calling();
		}
	}
}

public class PhoneDevelopment {

	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		Phone p1=new Phone("ralme",new Battery1("Nokia"));
		System.out.println("\1.Calling Features :\2.Contact Save");
		int ch=so.nextInt();
		if(ch==1) {
			p1.call();
		}
		else if(ch==2) {
			
		}
		int String=10;
		int StringBuider=12;
		int Exception=34;
		int Runnable=99;
		
		
	}
	
	/*
	 * * *
	 *****
	 * *
	 **/
	
}
