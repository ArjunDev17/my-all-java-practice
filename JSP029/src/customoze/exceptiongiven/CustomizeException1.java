package customoze.exceptiongiven;
class MyException1 extends RuntimeException {
	public String getMessage() {
		return "Wait bro";
	}
}

public class CustomizeException1 {
	public static void main(String[] args) throws MyException {
		int age = 12;
		if (age > 18) {
			System.out.println("eligble ");
		}
		else {
			MyException1 mo=new MyException1();
			throw mo;
			
		}		
	}
}

/*
 * what is an exception ?
 * can you handle an exception ?
 * how many types we have exception ?
 * what is an exception propagation ?
 * what is deference between throw and throws ?
 * Difference between final,finally,finalize ?
 * 
 * throw--->
 * 			1> it is a key word
 * 			2> used to throw exception
 * 			3> used inside the method for throw only one exception
 * 			4> it can handle checked and unchecked exception
 * 	Throws -->
 * 		1> keyword
 * 		2>we can declare an exception
 * */
