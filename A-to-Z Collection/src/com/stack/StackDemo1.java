package com.stack;

import java.util.*;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<Integer> so=new Stack<>();
		ArrayDeque<Integer> ao=new ArrayDeque<>();
		ao.add(12);
		ao.add(192);
		//System.out.println(ao.pollFirst());
		System.out.println(ao);
		so.add(2);
		so.add(41);
		so.add(6);
		so.add(8);
		//so.add("sd");
		so.add(10);
		int c=0;
		System.out.println(c+++ " "+so);
		System.out.println(so.peek());
		System.out.println(so.pop());
		System.out.println(so.push(23));
		System.out.println(ao.size());
		System.out.println(so.remove(0));
		System.out.println(so);
	}

}
