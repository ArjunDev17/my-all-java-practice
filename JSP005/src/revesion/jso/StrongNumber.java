package revesion.jso;

class Str{
	public void str_Num(int num) {
		int temp=num;
		int sum=0;
		int fact=1;
		while(num>0) {
			int rem=num%10;
			for(int i=1;i<rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Strong");
		}else {
			System.out.println("Not Stro");
		}
	}
}
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Str so=new Str();
		so.str_Num(123);

	}

}
