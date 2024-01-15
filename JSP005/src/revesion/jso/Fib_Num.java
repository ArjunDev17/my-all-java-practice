package revesion.jso;

class Sec{
	public void fib() {
		int n=5;
		int a=0,b=1,c=0;
		System.out.print(a+",");
		System.out.print(b+",");
		while(n>0) {
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
			n--;
		}
	}
	public void Nth_fib(int n1) {
		int n=5;
		System.out.println();
		System.out.println("nth number is "+n);
		int a=0,b=1,c=0;
		/*
		 * System.out.print(a+","); System.out.print(b+",");
		 */
		while(n>0) {
			int count=2;
			count++;
			c=a+b;
			if(n1==c) {
				System.out.println();
			    System.out.print("is it "+count+",");
			}
			a=b;
			b=c;
			n--;
	}
	}
}
public class Fib_Num {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sec so=new Sec();
		so.fib();
		so.Nth_fib(2);

	}

}

