package com.constr;

class ReacOperation {
	private int length;
	private int breadth;

	public ReacOperation(int lenght, int breadth) {
		this.breadth = breadth;
		this.length = lenght;
	}

	void area() {
		int area = length * breadth;
		System.out.println("Area of rectangle is :=" + area);
	}

	void perimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimter is :" + perimeter);
	}

	void display() {
		System.out.println("Dimesion are \nLength:" + length + "\nBreadth :" + breadth);
	}
}
public class Ap14 {

	public static void main(String[] args) {
		ReacOperation obj=new ReacOperation(3,5);
		obj.display();
		new ReacOperation(10,20).display();
	}

}
