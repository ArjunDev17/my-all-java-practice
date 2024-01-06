package com.basic.programOfString;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str="java is a java stil";
		String[]ch=str.split(" ");
		
		for(int i=0;i<=ch.length-1;i++) {
			int count=1;
			if(ch[i]=="")continue;
			for(int j=i+1;j<=ch.length-1;j++) {
				if(ch[i].equals(ch[j])) {
					ch[j]="";
					count++;
				}
				
			}	
			System.out.println(ch[i]+"="+count);
		}
//		for(int i=0;i<ch.length-1;i++) {
//			if(ch[i]!="") {
//				System.out.print(ch[i]+"");
//			}
//		}
		

	}

}
