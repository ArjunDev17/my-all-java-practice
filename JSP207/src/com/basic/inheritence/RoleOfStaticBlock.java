package com.basic.inheritence;

class A19{
	static {
		System.out.println("Parent class Static");
	}
	void dis() {
		
	}
	
}
class B19 extends A19{
	static {
		System.out.println("Child class Static");
	}
}
public class RoleOfStaticBlock {

	public static void main(String[] args) {
		A19 ao=new A19();
		B19 bo=new B19();
//		in this condition output will come
//		
//		::Parent class Static
//		Child class Static
		
		//here parent class not loaded so that first Parent clas
		//Static block will execute

	}

}
