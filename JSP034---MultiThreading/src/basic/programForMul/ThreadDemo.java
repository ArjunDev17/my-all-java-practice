package basic.programForMul;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi " + i);
		}

	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
		}

	}
}

public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Ram");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		MyThread1 mo1=new MyThread1();
		MyThread2 mo2=new MyThread2();
		ThreadDemo md=new ThreadDemo();
		 long startTime = System.currentTimeMillis();
		 System.out.println(startTime);
		  mo1.start();
		  mo2.start();
		  System.out.println();
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime);
	}
}
