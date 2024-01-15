package other.waySol;

public class DownRightAng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i-1;j++) 
				System.out.print("  ");
			
			for(int j=5;j>=i;j--) {
			System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}

/*
 * * * * * * 
* * * *   
* * *     
* *       
*
 * */
 */