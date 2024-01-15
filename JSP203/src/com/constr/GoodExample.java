package com.constr;

class Phone{
	static int count;
	
	{
		System.out.println("Second");
	}
	Phone(){
		System.out.println("First");
		count++;
	}
}
public class GoodExample {

	public static void main(String[] args) {
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		System.out.println("How many phone we are created :"+Phone.count);

	}

}
