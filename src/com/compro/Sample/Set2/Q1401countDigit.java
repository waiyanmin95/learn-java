package compro.Sample.Set2;

public class Q1401countDigit {
    public static int countDigit(int n, int digit) {
        if (n < 0) {
            return -1;
        }
        int result = 0;
        while (n > 0) {
            if (n % 10 == digit) {
                result++;
            }
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
        System.out.println(countDigit(-543, 3));
    }
}
