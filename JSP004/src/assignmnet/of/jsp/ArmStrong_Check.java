package assignmnet.of.jsp;

class Arm {
	public int count_dig(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public void arm(int n1) {
		int fact = 1, sum = 0;
		int n = n1;
		int temp = n1;
		int count = count_dig(n1);
		while (n > 0) {
			int r = n % 10;
			for (int i = 1; i < count; i++) {
				
				fact = fact * r;
			}
			sum += fact;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(" Arm ");
		}
		else {
			System.out.println("Not Arm Strong");
		}

	}
}
public class ArmStrong_Check {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arm ao = new Arm();
		ao.arm(153);

	}

}
