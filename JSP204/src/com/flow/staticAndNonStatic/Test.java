package com.flow.staticAndNonStatic;

class A{
	static {
		System.out.println("Static");
	}
//	{
//		System.out.println("Instance bloc");
//	}
	void m1() {
		System.out.println("Instance bloc");
	}
	A(){
		m1();
		System.out.println("Constructor");
	}
}

public class Test {

	public static void main(String[] args) {
		new A();
		new A();
		new A();
	}

}
//Static
//Instance bloc
//Constructor
//Instance bloc
//Constructor
//Instance bloc
//Constructor
