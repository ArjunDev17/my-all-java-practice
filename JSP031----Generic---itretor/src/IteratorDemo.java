import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		/*
		 * int a=10; for(int i:a) {
		 * 
		 * }
		 */
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		Iterator is=al.iterator();
		while(is.hasNext()) {
			Integer m=(Integer) is.next();
			if(m%2==0) {
				System.out.println(m);
			}else {
				is.remove();
			}
		}
		System.out.println("******************");
		System.out.println(al);
	}
}
