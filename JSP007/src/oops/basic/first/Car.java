package oops.basic.first;

import java.util.Scanner;

class Help{
	String name;
	String brand;
	long cost;
	Scanner so=new Scanner(System.in);
	public void setShoeData() {
		System.out.println("Enter Shoe name");
		name=so.next();
		System.out.println("Enter Barnd name");
		brand=so.next();
		System.out.println("Enter Prize");
		cost=so.nextInt();
	}
	public void setCarData() {
		System.out.println("Enter Car name");
		name=so.next();
		System.out.println("Enter Barnd name");
		brand=so.next();
		System.out.println("Enter Prize");
		cost=so.nextInt();
	}
	public void getShoeData() {
		System.out.println("Shoe name is :"+name);
		System.out.println("Brand name is :"+brand);
		System.out.println("shoe prize is :"+cost);
	}
	public void getCarData() {
		System.out.println("Car name is :"+name);
		System.out.println("Brand name is :"+brand);
		System.out.println("Car proze is :"+cost);
	}
}
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Help hp=new Help();
		hp.setCarData();
		hp.getCarData();
	}

}
