package first.basic_con;

class Idli1{
	String name="";
	int cost;
	String color="";
	String size;
	Idli1(){
		System.out.println("We are going to know about Idali::");
	}
	Idli1(String n,int c,String co,String s){
		name=n;
		cost=c;
		color=co;
		size=s;
	}
	public void getInfo() {
		System.out.println("Name of Idli is:"+name);
		System.out.println("Cost of Idli is:"+cost);
		System.out.println("Color of Idli is:"+color);
		System.out.println("Idli is:"+size);
	}
}
public class Idly_Call_to_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idli1 io=new Idli1("Rava",15,"Whilte","Small");
		Idli1 i1=new Idli1();
		io.getInfo();
		Idli i2=new Idli();

	}

}

