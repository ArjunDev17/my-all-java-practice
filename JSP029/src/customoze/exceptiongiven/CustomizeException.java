package customoze.exceptiongiven;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class CustomizeException {
	public static void main(String[] args) throws MyException {
		int age = 12;
		if (age > 18) {
			System.out.println("eligble ");
		}
		else {
			throw new MyException("you are not able");
		}
	}
}
