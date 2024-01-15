class Shape{
	String color;

	/**
	 * @param color
	 */
	Shape(){
		
	}
	public Shape(String color) {
		super();
		this.color = color;
	}
	
}
class Circle extends Shape{
	int redius;

	/**
	 * @param color
	 * @param redius
	 */
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		r=this.redius;
	}
	public Circle(String color, int redius) {
		super(color);
		this.redius = redius;
	}

	
	
	
}
public class SuperCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle co=new Circle(10);
		
		Circle co1=new Circle("Red",10);
		

	}

}
