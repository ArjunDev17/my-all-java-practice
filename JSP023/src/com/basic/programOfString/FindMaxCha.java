package com.basic.programOfString;

class FindMin{
	
	public static void main() {
		int min=0;
		String s1="ajdsfffffjldf";
		int count=0;
		char c=' ';
		while(s1!="") {
			char ch=s1.charAt(0);
			String s2=s1.replace(ch+"","");
			count=s1.length()-s2.length();
			if(min>count) {
				min=count;
				c=ch;
			}
			s1=s2;
		}
		System.out.println(c+"="+min);

	}
}
public class FindMaxCha {

	public static void main(String[] args) {
		FindMin.main();
		int max=0;
		String s1="ajdsfffffjldf";
		int count=0;
		char c=' ';
		while(s1!="") {
			char ch=s1.charAt(0);
			String s2=s1.replace(ch+"","");
			count=s1.length()-s2.length();
			if(max<count) {
				max=count;
				c=ch;
			}
			s1=s2;
		}
		System.out.println(c+"="+max);

	}

}
