package com.jspider.superkeyword;

public class BaseMain extends SuperClass {
	String name="Ram";
	BaseMain(String name, int roll_num) {
		super(name, roll_num);
		super.getData();
		System.out.println(this.name);
		System.out.println(super.name);
		
	}
	

	public static void main(String[] args) {
		BaseMain bo=new BaseMain("Kabeer",99);

	}

}
