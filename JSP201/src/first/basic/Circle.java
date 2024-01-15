package first.basic;

public class Circle {
	
	private int redius;

	public static void main(String[] args) {
		int redius;
		Circle c1,c2;
		new Circle();
		
		c1=new Circle();
		c2=new Circle();
		//Circle c1=new Circle();
		c1=new Circle();
		float a=12;
		
		c2=c1;
		c1.redius=10;
		System.out.println(c2.redius);
		System.out.println(c1.redius);
		
		c2.redius=20;
		
		System.out.println(c1.redius);
		System.out.println(c2.redius);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		

	}

}
