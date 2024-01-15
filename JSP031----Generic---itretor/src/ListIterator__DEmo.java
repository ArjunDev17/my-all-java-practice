import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator__DEmo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		ListIterator ls=al.listIterator(10);
		while(ls.hasPrevious()) {
			System.out.println(ls.previous());
		}
	}
}
