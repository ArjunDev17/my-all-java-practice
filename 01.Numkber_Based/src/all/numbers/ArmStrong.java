package all.numbers;
class A1{
	public static void Arm(int n) {
		int temp=n;
		int count=find_dig(n);
		System.out.println(count);
		int sum=0;
		while(n>0) {
			int fact=1;
			int re=n%10;
			for(int i=1;i<=count;i++) {
				fact*=re;
			}
			sum+=fact;
			n/=10;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("ArmStrong");
		}else
			System.out.println("Not");
	}
		private static int find_dig(int n) {
		
			int n1=0;
			while(n>0) {
				n1++;
				n/=10;
				}
		return n1;
	}
		
}

public class ArmStrong {

	public static void main(String[] args) {
		A1.Arm(153);
		
	}
	

}
