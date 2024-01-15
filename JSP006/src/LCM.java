
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=3;
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
