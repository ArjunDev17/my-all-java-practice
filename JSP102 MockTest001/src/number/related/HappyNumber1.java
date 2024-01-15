package number.related;

class HappyNumber{
	public boolean isHappy(int n) {
	    int slow = n, fast = n;
	    do {
	        slow = digitSquareSum(slow);
	        fast = digitSquareSum(digitSquareSum(fast));
	    } while (slow != fast);
	    return slow == 1;
	}

	private int digitSquareSum(int n) {
	    int sum = 0;
	    while (n > 0) {
	        int digit = n % 10;
	        sum += digit * digit;
	        n /= 10;
	    }
	    return sum;
	}

}
public class HappyNumber1 {

	public static void main(String[] args) {
		HappyNumber ho=new HappyNumber();
		System.out.println(ho.isHappy(7));
	}

}
