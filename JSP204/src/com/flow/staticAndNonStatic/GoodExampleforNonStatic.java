package com.flow.staticAndNonStatic;

class Car{
	static int regNum=100;
	String col;
	String cn;
	int rn;
	{
		 rn=regNum++;
	}
	Car(String cn,String col){
		
		System.out.println("*********************");
		System.out.println("car name :"+cn);
		System.out.println("car Color :"+col);
		System.out.println("car register name :"+rn);
	}
	Car(String cn){
		System.out.println("car name :"+cn);
		
		System.out.println("car register name :"+rn);
	}
}

public class GoodExampleforNonStatic {

	public static void main(String[] args) {
		
		Car co=new Car("Jwar","Black");
		Car co1=new Car("Jwar F model","Black");
		Car co2=new Car("red");
		

	}

}
