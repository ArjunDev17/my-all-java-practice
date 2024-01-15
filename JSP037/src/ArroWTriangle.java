
public class ArroWTriangle {
	public static void main(String[] args) {
		int star=9;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=9/2) {
				star++;
			}
		}
	}
}
