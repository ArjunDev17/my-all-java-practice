package com.bubblesort;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student1 implements Comparable {
	String name;
	long mobileno;
	String course;
	int age;

	public Student1(String name, long mobileno, String course, int age) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.course = course;
		this.age = age;
	}

	public String toString() {
		return "name =" + name + "  mobileno =" + mobileno + "  course =" + course + "  age =" + age;
	}

	@Override
	public int compareTo(Object o1) {
		Student s = (Student) o1;
		return this.name.compareTo(s.name);
		
	}
	Student1()
	{
		
	}

}
class SortByAge implements Comparator
{

	@Override
	public int compare(Object o1,Object o2) {
		Student1 s1=(Student1)o1;
		Student1 s2=(Student1)o2;
		if(s1.age==s2.age)
		{
			return 0;
		}
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
	}
public class Application {
	public static void main(String[] args) {
		Student1[] s = { new Student1("ravi", 4567898, "java", 25), new Student1("sheela", 456789, "python", 23),
				new Student1("Arjun", 56789, "python", 24), new Student1("mala", 56789, "python", 24) };
		
		Scanner sc=new Scanner(System.in);
        System.out.println("************welcome***************");
        System.out.println("1.SortBy name\n2.SortBy age");
        System.out.println("choose the option");
        int option=sc.nextInt();
        switch(option)
        {
        case 1:
        {
       	 Arrays.sort(s);
    		for (Student1 b : s) {
    			System.out.println(b);
    		}
        }
        break;
        case 2:
        {
       	 Arrays.sort(s,new SortByAge());
       	for (Student1 b : s) {
			System.out.println(b);
		}
        }
        break;
        
        }
	}
}
