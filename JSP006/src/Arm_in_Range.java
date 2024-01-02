import java.util.Scanner;

class Rang{
	 static Scanner so=new Scanner(System.in);
	public static void isArm(int start) {
		int num=start,sum=0;
		int count=0;
		while(num>0) {
			count++;
			num/=10;
			
		     }
		num=start;
		while(num>0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=count;i++) {
				fact*=rem;
			}
			sum+=fact;
			num/=10;
		}
		if(sum==start) {
			System.out.println(sum);
		}
	}
	public static void arm() {
		System.out.println("Plzz enter Starting and ending point");
		int start=so.nextInt();
		int end=so.nextInt();
		for(int i=start;i<end;i++) {
			isArm(i);
		}
	}
}
public class Arm_in_Range {

	public static void main(String[] args) {
		
		Rang ro=new Rang();
		ro.arm();

	}
	
	

}
/*case 1:
			System.out.println("1: for Armstrong number");
		case 2:
			break;
		case 3:	
			System.out.println("2: for Strong Number number");
			break;
		case 4:
			System.out.println("3: for Perfect number");
		case 5:
			System.out.println("4: for Armstrong number");
			break;
		case 6:
			System.out.println("5: for AutoMorphic number");
			break;
		case 7:
			System.out.println("6: for Pailendrom number");
			break;
		case 8:
			System.out.println("7: for Neon number");
			break;
		case 9:
			System.out.println("8: for Happy number");
		}  */