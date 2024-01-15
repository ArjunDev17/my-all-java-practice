package basic.programForMul;

class MyThread3 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Ram " + i);
		}

	}
}

class  MyThread4 implements Runnable  {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Sheeta " + i);
		}

	}
}

public class RunnableImplimentationDemo {
	public static void main(String[] args) throws Exception {
		MyThread3 mo1=new MyThread3();
		MyThread4 mo2=new MyThread4();
		Thread tt=new Thread(mo1);
		Thread t2=new Thread(mo2);
		RunnableImplimentationDemo md=new RunnableImplimentationDemo();
		 long startTime = System.currentTimeMillis();
		 System.out.println(startTime);
		  tt.start();
		  t2.start();
		  System.out.println();
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime);
	}
}
