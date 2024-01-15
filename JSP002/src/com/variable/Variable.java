package com.variable;

class Var{
	int n1=12;
}
public class Variable {
	static int n1=12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 n1=13;
		//	static int n11=10;//Illegal modifier for parameter n11; only final is permitted
		System.out.println(n1);
		//System.out.println(super.n1);
	}
	public void  m1() {
		//static int n1=10;
		//only final is permitted
		System.out.println(n1);
		//System.out.println(super.n1);
		//n1 cannot be resolved or is not a field
	}

}
/*Static variable we can Override
 * Locale  variable we can't Override
 * 
 * */
