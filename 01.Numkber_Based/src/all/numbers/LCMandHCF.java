package all.numbers;

class Man{
	public static  int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
			
	}
	public static  int lcm(int a,int b) {
		return 0;
	}
	
}
public class LCMandHCF {

	public static void main(String[] args) {
		
	int g=Man.gcd(12,4);
	System.out.println(g);
	int l=LCM(32,8);
	System.out.println(l);

	}

	private static int LCM(int a, int b) {
		int c=1;
		int num=1;
		while(num>0) {
			if(num%a==0 && num%b==0 && num%c==0) {
				return num;
				//break;
			}
			num++;
		}
		
		return 0;
	}

}
