package number.based2;
interface SN{
	abstract void find_Fact(int x);
}
public class Strong_Numbwer {
	public static void main(String[] args) {
		SN so=(x)->{
			int num=x;
			System.out.println("Labmda");
			int fact=Fact(x);
			
			if(num==fact) {
				System.out.println("Strong number");
			}else {
				System.out.println("Not");
			}
		};
		System.out.println("Please enter your digit :");
		so.find_Fact(145);

	}
	private static int Fact(int x) {
		
		int sum=0;
		while(x>0) {
			
			int rem=x%10;
			int dig=getDigFac(rem);
			sum+=dig;
			x/=10;
		}
		return sum;
	}

	private static int getDigFac(int x) {
			int x1=1;
			for(int i=1;i<=x;i++) 
				x1=x1*i;
			 return x1;
		}
	}
