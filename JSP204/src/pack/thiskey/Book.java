package pack.thiskey;

class B{
static String t;
	String a;
	B(String t1){
		t=t1;
	}
	B(String t1,String a2){
		//t=t1;
		//this(t1);
		new B(t1);
		a=a2;
	}
}
public class Book {

	public static void main(String[] args) {
		
		B obj=new B("java","James");
		System.out.println(obj.t);
		System.out.println(obj.a);

	}

}
