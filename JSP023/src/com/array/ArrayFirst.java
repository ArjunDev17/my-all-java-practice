package com.array;

class A{
	void dis() {
		int []arr;
		arr=new int[5];
		char []ch=new char[7];
		System.out.println(ch[0+2]);
		//arr[5]=19;
		System.out.println(arr[5-2]);
		
		Object[] ch1=new Object[10];
		
		ch1[0]="Ram";
		ch1[1]=1;
		ch1[2]=34.6;
		
		System.out.println(ch1[0]);
		System.out.println(ch1[1]);
		System.out.println(ch1[2]);
		
		long a=12;
		float b=a;
	}
}
public class ArrayFirst {

	public static void main(String[] args) {
		A obj=new A();
		obj.dis();
	}

}
