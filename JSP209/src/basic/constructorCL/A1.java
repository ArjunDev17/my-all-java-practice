package basic.constructorCL;

class A2{
	int i,j;
	A2(){
		i=10;
	}
	A2(int j){
		j=30;
	}	
}
class B extends A2{
	int k;
	B(){
		new A2(60);
		 k=20;
	}
}
public class A1 {

	public static void main(String[] args) {
		B ob=new B();
		System.out.println(ob.k);
		System.out.println(ob.i);

	}

}
