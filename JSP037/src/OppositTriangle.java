
public class OppositTriangle {
	public static void main(String[] args) {
		int star=5;
		
		int space=0;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j==1 ||j==star||i==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			star-=2;
			space++;
		}
	}
}

