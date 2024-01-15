package com.basic.inheritence;

class P{
	static void m1() {
		System.out.println("It willl not inhertide");
	}
}
class Q extends P{
	
}
public class StaticinMethodinInhrtince {

	public static void main(String[] args) {
		P.m1();
		Q.m1();
		//it is only given different types option to call the
		//static method and variable

	}

}
