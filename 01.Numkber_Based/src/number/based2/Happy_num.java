package number.based2;

public class Happy_num {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        } while (slow != fast);
        
        return slow == 1;
    }
    
    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] kab) {
    	boolean t=Happy_num.isHappy(94);
    	System.out.println(t);
    }
}
