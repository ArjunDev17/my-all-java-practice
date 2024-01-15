package com.constr.overlosing;

class A{
	
	A(){
		System.out.println("Without parametrized");
	}
	A(int n){
		System.out.println("With parametrized :"+n);
	}
}
public class Basic {

	public static void main(String[] args) {
		new A();
		new A(2);

	}

}
