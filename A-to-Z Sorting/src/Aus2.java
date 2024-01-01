class A1{
	void dis() {
		System.out.println("Parent");
	}
}
class A2 extends A1{
	void dis() {
		System.out.println("Child");
	}
}
public class Aus2 {

	public static void main(String[] args) {
		A1 ob=new A1();
		A2 ob2=new A2();
		ob.dis();
		ob2.dis();
		A1 op=new A2();
		op.dis();
		A2 oc=(A2) new A1();
		oc.dis();

	}

}
