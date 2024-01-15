package looping_statemnts;

public class SumOfDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0004,sum=0,count=0;
		while(num>0) {
			int n1=num%10;
			sum+=n1;
			count++;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println("TOtal digit is "+count);
	}

}
