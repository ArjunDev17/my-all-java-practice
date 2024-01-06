package com.abstract_keyword;

interface A1{
	int a=12;
	public final void s1() {
		//only public, private, abstract, default, static and strictfp
		System.out.println("Hi");
	}
	public void dis() {
		
	}
	private void dis1() {
		
	}
static void dis3() {
		
	}
	strictfp void dis4() {
	
	}
}
interface A2 extends A1{
	
	int a=10;
}
class B {
	
}
public  class A<impliments> extends B implements A2{

	@Override
	public void s1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public strictfp void dis4() {
		// TODO Auto-generated method stub
		
	}

	
}
