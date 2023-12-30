package com.basic.program;
interface G1{
	    void findBig(int n1,int n2,int n3);	  
	    default void dis()   {
	    	
	    }
}
public class GreatestNum {
	public static void main(String[] args) {
		G1 fobj = (int x,int y,int z)->{
			
		};
		   fobj.findBig(5,7,9);
	}
}
