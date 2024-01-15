package number.related;
class Man{
	public static  int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}			
	}
	public static  void lcm() {
		int a=3;
		int b=2;
		int c=5;
		int num=1;
		while(num>0) {
			if(num%a==0 && num%b==0 && num%c==0) {
				System.out.println(num);
				break;
			}
			num++;
		}		
	}		
}
public class LCMandHCF {
	public static void main(String[] args) {		
	int g=Man.gcd(12,4);
	System.out.println(g);

	}
}

