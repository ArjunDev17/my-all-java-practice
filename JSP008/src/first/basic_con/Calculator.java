package first.basic_con;

import java.util.Scanner;

class Cal_Help{
	int num1,num2;
	Scanner so=new Scanner(System.in);
	public void takeInput() {
		System.out.println("Please enter value :");
		this.num1=so.nextInt();
		System.out.println("Please enter value :");
		this.num2=so.nextInt();
		//this.Cal_Help(num1,num2);
		
		
	}
	Cal_Help(){
		this(4);
		takeInput();
		
		System.out.println("Addition of two number is :"+(num1+num2));
		Cal_Help c1=new Cal_Help(3);
		
	}
	Cal_Help(int a){
		takeInput();
		System.out.println("It is a Parametri");
		System.out.println("Addition of two number is :"+(num1+a));
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_Help co=new Cal_Help();

	}

}
