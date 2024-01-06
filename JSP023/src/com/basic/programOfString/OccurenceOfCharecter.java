package com.basic.programOfString;

public class OccurenceOfCharecter {

	public static void main(String[] args) {
		String s1 = "Ram is  a God";
		while (s1 != "") {
			char ch = s1.charAt(0);
			String s2 = s1.replace(ch + "", "");
			int count = s1.length() - s2.length();
			s1 = s2;
			if (ch != ' ')
				System.out.println(ch + "=" + count);
		}

	}

}
