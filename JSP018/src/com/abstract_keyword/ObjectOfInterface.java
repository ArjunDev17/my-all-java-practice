package com.abstract_keyword;

interface A12{	
	
	void sum();
	
}
public class ObjectOfInterface {

	public static void main(String[] args) {
		
		A12 ob=()->{
			System.out.println("Ji Mata DI");
		};
		ob.sum();

	}

}
