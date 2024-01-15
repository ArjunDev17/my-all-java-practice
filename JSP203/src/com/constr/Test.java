package com.constr;

class A{	
	//for class A java will create default constructor
	static class B{
		
	}
}
class D{
	//but for class D java will not create Default constructor
	D(int i){
		System.out.println(i);
	}
}
public class Test {

	public static void main(String[] args) {
		new D(9);
		new A();
//		new D();
//		new A(9);

	}

}
