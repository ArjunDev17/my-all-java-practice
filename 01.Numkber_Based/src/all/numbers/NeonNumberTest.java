package all.numbers;


class NeonNumber {
    public boolean isNeon(int n) {
        int digitSquareSum = 0;
        int square = n * n;
        while (square > 0) {
            int digit = square % 10;
            digitSquareSum += digit;
            square /= 10;
        }
        return digitSquareSum == n;
    }
}

public class NeonNumberTest {

    public static void main(String[] args) {
        NeonNumber nn = new NeonNumber();
        System.out.println(nn.isNeon(9));
    }
}

