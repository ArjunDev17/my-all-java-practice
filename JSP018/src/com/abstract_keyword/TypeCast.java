package com.abstract_keyword;

interface Ob1{
	void dis();
}
class V implements Ob1{

	@Override
	public void dis() {
		System.out.println("Hi mom");
		
	}
	
}
public class TypeCast  {

	public static void main(String[] args) {
	
		V o= new V();
		
		Ob1 o2= new V();
		
		Ob1 o3=(Ob1)o;
		
		o.dis();
		o2.dis();
		

	}

}
