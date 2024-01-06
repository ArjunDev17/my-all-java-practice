package another.packagefor.check;

import basic.acces.modifer.*;

public class A2 {
	int i;
	First fo = new First();
	int c=fo.b;
	protected int p=10;
	public void dis() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		//System.out.println(i);
		First fo = new First();
		System.out.println(fo.b);
	}

}
