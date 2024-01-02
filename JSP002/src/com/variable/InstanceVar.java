package com.variable;

public class InstanceVar {
	int age=12;
	int b;
	public static void main(String[] args) {
		
		
		int a;
		//System.out.println(a);
		
		InstanceVar iObj=new InstanceVar();
		System.out.println(iObj.b);
			
		iObj.age=23;
		System.out.println(iObj.age);
		
		InstanceVar iObj1=new InstanceVar();
		iObj1.age=24;
		System.out.println(iObj1.age);
		

	}

}
