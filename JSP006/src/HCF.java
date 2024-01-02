
class HCF1{
	public int gcd(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	public void gcd_fun(int a,int b) {
		int gcd=0;
		for(int i=1;i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}
	int hcf(int n1, int n2) {
	    if (n2 != 0)
	        return hcf(n2, n1 % n2);
	    else
	        return n1;
	}
}
public class HCF {

	public static void arm() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HCF1 ho=new HCF1();
		ho.gcd_fun(12, 8);
		int gcd=ho.hcf(12, 8);
		System.out.println(gcd);
		

	}

}
