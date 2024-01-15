package number.related;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
class C{
	public static int rev(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		return sum;
	}
}
public class ReverseNum {

	public static void main(String[] args) {
		out.println("Hello "+sqrt(4));
		int r=C.rev(123);
		System.out.println(r);

	}

}
