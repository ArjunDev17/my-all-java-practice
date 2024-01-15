package number.related;

class A{
	public static void swa() {
		int a=12;
		int b=2;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
public class Swap {

	public static void main(String[] args) {
		A.swa();

	}

}
