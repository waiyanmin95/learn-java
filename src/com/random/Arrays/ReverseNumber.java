package random.Arrays;

public class ReverseNumber {
    public static int noArray(int n) { //todo
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(noArray(1234));
        System.out.println(noArray(12005));
        System.out.println(noArray(1));
        System.out.println(noArray(1000));
        System.out.println(noArray(0));
        System.out.println(noArray(-12345));
    }
}
