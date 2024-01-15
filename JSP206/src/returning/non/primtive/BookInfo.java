package returning.non.primtive;

import java.util.Scanner;

class Book{
	String title;
	String author;
	double price;
	/**
	 * @param title
	 * @param author
	 * @param p
	 */
	public Book(String title, String author, double p) {
		super();
		this.title = title;
		this.author = author;
		this.price = p;
	}
	void display() {
		System.out.println
		("Book[title="+title+",author="+author+",+Price="+price+"]");
	}
}

// it is like Factory Class

class BookCreator{
	static Book create() {
		Scanner so=new Scanner(System.in);
		System.out.println("Enter title");
		String st=so.next();
		System.out.println("Enter Author");
		String sa=so.next();
		System.out.println("Enter Price");
		double p=so.nextDouble();
		return new Book(st,sa,p);
		
	}
	
	
}
public class BookInfo {

	public static void main(String[] args) {
		Book b1=BookCreator.create();
		b1.display();

	}

}
