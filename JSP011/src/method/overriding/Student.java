package method.overriding;

public class Student extends ParentClass {

	public static void main(String[] args) {
		ParentClass so= new ParentClass();
		so.marry();
		ParentClass so1= new Student();
		so1.marry();
		}
	

}
