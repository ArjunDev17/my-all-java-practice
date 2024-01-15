package first.time;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		
		System.out.println(al.size());
		System.out.println(al);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(8, -5);
		System.out.println(al);
		int a=23;
		al.add(a);
		System.out.println(al.get(3));
	
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		ArrayList a1l=new ArrayList();
		a1l.addAll(al);
		System.out.println("*******************");
		System.out.println(a1l);
	}
}
