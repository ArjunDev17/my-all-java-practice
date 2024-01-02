package first.basic_con;

class Idli{
	String name="";
	int cost;
	String color="";
	String size;
	Idli(){
		System.out.println("We are going to know about Idali::");
	}
	Idli(String n,int c,String co,String s){
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
public class Idali_Pre_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idli io=new Idli("Rava",15,"Whilte","Small");
		Idli i1=new Idli();
		io.getInfo();
		Idli i2=new Idli();

	}

}
