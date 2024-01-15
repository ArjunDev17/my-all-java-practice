package com.constr;

class Car{
	String color;
	int regNum;
	private static int n=1000;
	Car(String c){
		this.color=c;
		regNum=n++;
	}
	void dis() {
		System.out.println("Registr Number :"+regNum);
		System.out.println("COlor Number :"+color);
	}
	void d() {
		System.out.println("10");
	}
}
public class Apr142 {
	
	public static void main(String[] args) {
		Car c1=new Car("Black");
		Car c2=new Car("Blue");
		Car c3=new Car("Brown");
		System.out.println("#######################");
		c1.dis();
		System.out.println("#######################");
		c2.dis();
		System.out.println("#######################");
		c3.dis();
		System.out.println("#######################");
			new Car("Read").dis();
//		System.out.print(new Car("Read").dis());
//		System.out.println(c1.d());
		
		

	}

}
