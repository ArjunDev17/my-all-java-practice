package com.stack_implimentation;

import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Stack;

class Stack1 {
	
	Object[] arr = new Object[5];
	int index = 0;

	public void push(Object e) {
		if (index >= arr.length)
			increase();
		arr[index] = e;
		index++;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	private int size() {

		return index;
	}

	private void increase() {

	}

	public Object peek() {
		return arr[index - 1];
	}
}

public class StackDemo {
	public static void main(String[] args) {
		Stack1 so=new Stack1();
		
	}
}
