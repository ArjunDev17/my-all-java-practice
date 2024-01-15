package other.waySol;

class Pa{
	static void display(int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n;j++) {
				if(j<=i)
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void display2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
public class DownRightAngle {
public static void main(String[] args) {
	Pa.display2(5);
	System.out.println("* * * * * *");
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i-1;j++) 
			System.out.print("");
		for(int j=5;j>=i;j--) {
		System.out.print("* ");
		}
		System.out.println();
		
	}
	
	
}
}
