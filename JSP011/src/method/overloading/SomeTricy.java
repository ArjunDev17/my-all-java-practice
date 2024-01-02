package method.overloading;
 
class A{
	public void m1(int x) {
		System.out.println("First "+x);
	}
	public void m1(float x) {
		System.out.println("First ");
	}
	public void m1(double x) {
		System.out.println("First "+x);
	}
	public void m1(long x) {
		System.out.println("First "+x);
	}
	
}
public class SomeTricy {

	public static void main(String[] args) {
		A ob=new A();
		ob.m1(10.0);
	}

}
