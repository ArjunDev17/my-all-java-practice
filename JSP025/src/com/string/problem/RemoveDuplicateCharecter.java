package com.string.problem;

public class RemoveDuplicateCharecter {

	public static void main(String[] args) {
		String s1="RaaamisisaaaGod";
		
		while(s1!="") {
			char ch=s1.charAt(0);
			String s2=s1.replace(ch+"","");
			//System.out.println(s2);
			System.out.print(ch);	
			s1=s2;			
		}

	}

}
