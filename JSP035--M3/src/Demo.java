class MyCar extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
		System.out.println("Hello Mom");
	}
}
}
	class MySuperCar extends Thread{
		public void run() {
			for (int i=0;i<5;i++) {
			System.out.println("Mom_PAPA");
		}
	}
	}
public class Demo {

	public static void main(String[] args) {
		MyCar mo=new MyCar();
		
		mo.start();
		MySuperCar mo2=new MySuperCar();
		mo2.start();
	}

}
