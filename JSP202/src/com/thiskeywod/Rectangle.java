package com.thiskeywod;

class ReacOperation {
	private int length;
	private int breadth;

	void initilizer(int lenght, int breadth) {
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
		System.out.println("Dimesion are :" + length + " Breadth :" + breadth);
	}
}

public class Rectangle {

	public static void main(String[] args) {
		ReacOperation obj = new ReacOperation();
		obj.initilizer(20, 40);
		obj.display();
		obj.area();

	}

}
