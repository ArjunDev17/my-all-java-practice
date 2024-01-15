package com.thiskeywod;

class SomeOper {
	int num;

	int leanghthOfNum() {
		int num1 = num;
		int count = 0;
		while (num1 > 0) {
			count++;
			num1 /= 10;
		}
		return count;
	}

	boolean isPrime() {
		if (num == 1)
			return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 5; i * i <= num; i = i + 6)
			if (num % i == 0 || num % i + 2 == 0)
				return false;
		return true;
	}
	boolean isperfect() {
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(num%1==0)
				sum+=i;
		}
		if(sum==num)
			return true;
		return false;
					
	}
}
public class ObjectApproch {

	public static void main(String[] args) {
		SomeOper so=new SomeOper();
		so.num=4567;
		System.out.println(so.isperfect());
		System.out.println(so.isPrime());
		System.out.println(so.leanghthOfNum());

	}

}
