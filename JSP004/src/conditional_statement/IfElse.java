package conditional_statement;

class Test {
	public void dis() {
		if (true) {
			System.out.println("It is working");
	
		}
	}
	public void three1() {
	int a=11,b=3,c=54,d=12;
	int d1 = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	System.out.println(d1);
}
	
	public void Five() {
		int a=12,b=23,c=54,d=11,e=99;
		if(a>b && a>c && a>d && a>e) {
			System.out.println("Gretest number"+a);
		}
		else if(b>a && b>c && b>d && b>e) {
			System.out.println("Gretest number"+b);
		}
		else if(c>a && c>b && c>d && c>e) {
			System.out.println("Gretest number"+c);
		}
		else if(d>b && d>c && d>a && d>e) {
			System.out.println("Gretest number"+d);
		}
		else if(e>b && e>c && e>d && e>a) {
			System.out.println("Gretest number"+e);
		}
	}


public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test to=new Test();
		to.Five();
	}

}
}
