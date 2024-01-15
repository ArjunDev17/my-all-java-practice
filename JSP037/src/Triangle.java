
public class Triangle {
	public static void main(String[] args) {
		int s=1;
		int space=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=s;j++) {
				System.out.print("*");
			}
			System.out.println();
			s+=2;
			space--;
		}
	}
}
