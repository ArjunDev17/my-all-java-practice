package com.method;

class Test{
	public void m1() {
		System.out.println("Hi");
		m2();
	}
	public void m2() {
		System.out.println("Hi m2");
		m3();
	}
	public void m3() {
		
		System.out.println("Hi m3");
	}
}


public class DemoFun {//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Good Morning");
		Test to=new Test();
		to.m1();
		to.m2();
		
	}
	public void m6() {
		System.out.println("inside m1 ");
		String r="ram;";
		//main(r);
	}
	static {
		System.out.println("Hi");
	}

}
