package basic.programForMul;

class TimeCheckExample {
    public void ain() {
        long startTime = System.currentTimeMillis();
        
        // Perform some operations or code execution
        
        long endTime = System.currentTimeMillis();
        
        long totalTime = endTime - startTime;
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Total Time: " + totalTime + " milliseconds");
    }
}




class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("good mornig "+i);
		}
		
	}
}
public class FirstDemo {

	public static void main(String[] args) {
		
		MyThread mo=new MyThread();
		MyThread mo1=new MyThread();
		System.out.println();
		mo.start();
		
		mo1.start();

	}

}
