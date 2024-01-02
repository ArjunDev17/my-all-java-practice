package revesion.jso;

class Per{
	public void per(int num) {
		int sum=0,temp=num;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if (temp==sum) {
			System.out.println("Perfect num");
		}else {
			System.out.println("Not Prime");
		}
	}
}
public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Per po=new Per();
		po.per(6);

	}

}
