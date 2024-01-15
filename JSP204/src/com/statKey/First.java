package com.statKey;

class A{
	static {
		System.out.println("A 1  class Static");
	}
	static {
		System.out.println("A 2  class Static");
	}
	{
		
	}
	static void m1(){
		System.out.println("m1()");
		//static	{
			
		}
	}

public class First {

	public static void main(String[] args) {
		
		A obj=new A();
		obj.m1();

	}
	static {
		System.out.println("Main class Static");
	}
	static void m12(){
		System.out.println("m1()");
	}
	

}
