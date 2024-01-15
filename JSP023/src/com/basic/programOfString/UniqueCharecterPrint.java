package com.basic.programOfString;

public class UniqueCharecterPrint {

	public static void main(String[] args) {
		String s1="RAM";
		String s2="RAJ";
		printCH(s1,s2);
		

	}

	private static void printCH(String s1, String s2) {
		String s3=s1+s2;
		System.out.println(s3);
		//removDuplcate(s3);
		
	}

	private static void removDuplcate(String s3) {
		String s1=s3.toLowerCase();
		while(s1!="") {
			char ch=s1.charAt(0);
			String s2=s1.replace(ch+"","");
			System.out.print(ch);	
			s1=s2;			
		}
		
	}

}
