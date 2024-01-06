package com.string.problem;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Ran";
		if(s1.length()!=s2.length())
			System.out.println("Not an angaram");
		else {
			char []ch=s1.toCharArray();
			char[]ch2=s2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch2);
			String s3=new String(ch);
			String s4=new String(ch2);
			if(s3.equals(s4))
				System.out.println("Anagram");
			else {
				System.out.println("Not an angaram");
			}
		}

	}

}
