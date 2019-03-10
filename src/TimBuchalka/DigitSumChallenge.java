package TimBuchalka;

public class DigitSumChallenge {

    public static void main(String[] args) {
        int result = sumDigits(4951);
        System.out.println("The Sum is: " + result);
    }

    public static int sumDigits(int n) {
        if (n >= 10) {
            int sum = 0;
            int r = 0;
            while (n > 0) {
                r = n % 10;
                n /= 10;
                sum += r;
            }
            return sum;
        }
        return -1;
    }
}