package first.basic;

class A1{
	static int i;
	int a;
	void m1() {
		int a=1;
		System.out.println(a);
		System.out.println(i);
		System.out.println(this.a);
	}
	static void m2() {
		System.out.println(this.a);
	}
	static {
		System.out.println(this.a);
	}
	{
		System.out.println(this.a);
	}
}
public class A {

	public static void main(String[] args) {
		
		A1 obj= new A1();
		obj.m1();
		obj.a=12;
		obj.m1();
	
	}
}
