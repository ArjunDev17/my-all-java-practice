package com.basic.inheritence;
class A{
	void m1() {
		System.out.println("Hi i'm");
	}
}
class B extends A{
	void dis() {
		System.out.println("Inside Child class");
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		ob.m1();
		ob.dis();
		
		B o1=(B) new A();
		
		A o2=new B();
		
		o1.m1();
		o1.dis();

	}

}
