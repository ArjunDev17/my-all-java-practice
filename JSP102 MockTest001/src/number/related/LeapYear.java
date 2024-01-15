package number.related;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4 and not divisible by 100,
        // or if it is divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
