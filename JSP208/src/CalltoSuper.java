
class A{
	public A() {
		System.out.println("// TODO Auto-generated constructor  A");
	}
}
class B extends A{
	B(){
		//super();
		System.out.println("// TODO Auto-generated constructor B");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("// TODO Auto-generated constructor C");
	}
}
public class CalltoSuper {

	public static void main(String[] args) {
		new C();

	}

}
