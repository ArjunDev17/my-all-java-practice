package returning.non.primtive;

class RNon{
	Test m1() {
		return new Test(10);
	}
}
public class Test {

	public Test(int i) {
		
	}

	public static void main(String[] args) {
		RNon s1=new RNon();
		Test t1=new Test(5);
		Test to=s1.m1();

	}

}
