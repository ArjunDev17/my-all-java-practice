package com.basic.apr19;

public class ReplaceCharecte {

	public static void main(String[] args) {
		String str="Hello world";
		replaceCh(str);

	}

	private static void replaceCh(String str) {
		String str1=" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='l'&& str.charAt(i+1)=='l' ) {
				str1+="xx";
				i=i+1;
			}else {
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
