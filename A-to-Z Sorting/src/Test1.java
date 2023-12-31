class A{
	int i=1;
	void m1() {
		System.out.println("m1 method");
	}
}
class B1 extends A{
	int j=2;
	void m1() {
		System.out.println("m2 method");
	}
}
public class Test1 {

	public static void main(String[] args) {
		A a1;
		a1=new B1();
		System.out.println(a1.i);
		A obj=new A();
		obj=new B1();
		a1.m1();
		System.out.println(a1.j);

	}
	

}
