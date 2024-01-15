
class Human{
	String name;

	/**
	 * @param name
	 */
	public Human(String name) {
		super();
		this.name = name;
	}
}
class Teacher extends Human{
	String  sub;

	/**
	 * @param name
	 * @param sub
	 */
	public Teacher(String name, String sub) {
		super(name);
		this.sub = sub;
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
