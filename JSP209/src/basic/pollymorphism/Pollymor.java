package basic.pollymorphism;

import java.util.*;
class A{
	void dis(int a,int c) {
		
	}
}
class B extends A{
  @Override
  void dis(int a,int c) {
//		int d=19;
//		byte b=d;
//		float f=3.9f;
//		long l=f;
//		long l1=10;
//		float f2=l1;
	}
}
public class Pollymor {

	public static void main(String[] args) {
		//Using Parents Object we can refer any Child Object
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Float.BYTES);
		System.out.println(Short.BYTES);
		System.out.println(Byte.BYTES);
		System.out.println(Character.BYTES);
		List l=new ArrayList();
		 List l1=new LinkedList();
		 List l2=new Vector();
		List l3=new Stack();
		
		/*
		 * 6. Conclusion : In overloading compiler is responsible to perform method
		 * resolution(decision) based on the reference type(but not based on run time
		 * object). Hence overloading is also considered as compile time
		 * polymorphism(or) static polymorphism (or)early biding.
		 */
	}

}
