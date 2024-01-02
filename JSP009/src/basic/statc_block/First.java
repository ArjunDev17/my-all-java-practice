package basic.statc_block;

class F1 {
	F1(){
		System.out.println("Constructor");
	}
	static {
		System.out.println("Another class 4");
	}
	{
		System.out.println("Another class : static block 5");
	}
	{
		System.out.println("6");
	}
}

public class First {
	static int a = 10;
	final int b=19;
	{
		//b=1;
	}
	static int b1=100;
	static {
		int j;
		System.out.println("1");
		//b=100;
		b1=9;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = 90;
		//b=11;
		First fo = new First();
		F1 ob = new F1();

		System.out.println("Mian Method");

	}

	{
		System.out.println("Non static inside First 7");
	}
	static {
		System.out.println("2");
		a = 100;
	}
	static {
		System.out.println("3");
	}

}
