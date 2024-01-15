package oops.basic.first;

class Car1{
	String name="Karan";
	//String name3; if we want to find name3 address it will 
	long price;
	static String name2="Ram";
	// Car c=new Car();
	static int a=10;
	public void dis() {
		System.out.println(a);
		
	}
	
}
public class StaticInstanceVariable {

	public static void main(String[] args) {
		 Car1 co=new Car1();
		 co.dis();
		 
		 System.out.println("First static Value 1S:"+co.name2+" Address:\" :"+co.name2.hashCode());
		 System.out.println("Non static :Value 1NS:"+co.name+" Address:"+co.name.hashCode());
		 co.name="Arjun";
		 Car1.name2="Sheeta";
		 System.out.println("First static Value 2S:"+Car1.name2+" Address:\" :"+co.name2.hashCode());
		 System.out.println("Non static :Value 2NS:"+co.name+" Address:"+co.name.hashCode());
		
	}

}
