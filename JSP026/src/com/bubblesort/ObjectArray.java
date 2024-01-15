package com.bubblesort;

import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparator {
	String name;
	int mobile_Number;
	String course;
	String email;
	int age;

	/**
	 * @param name
	 * @param i
	 * @param course
	 * @param email
	 * @param j
	 */
	public Student(String name, int i, String course, String email, int j) {
//		super();
		this.name = name;
		this.mobile_Number = i;
		this.course = course;
		this.email = email;
		age = j;
	}

	public String toString() {
		return "Name :" + name + "\nMobile Number :" + mobile_Number + "\nCourse :" + course;

	}

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return 0;
	}

}

public class ObjectArray {

	public static void main(String[] args) {
		
		Scanner sys = new Scanner(System.in);
		Student[] so = new Student[6];
		Student[] s1 = { new Student("Ram", 9451, "Java", "aj@321", 25), new Student("Raj", 8151, "Java", "aj@321", 45),
				new Student("Barb", 7651, "Java", "aj@321", 99) };
		for (Student b : s1) {
			System.out.println(b);
		}
	}

}
