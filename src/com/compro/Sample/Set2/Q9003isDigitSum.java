package compro.Sample.Set2;

public class Q9003isDigitSum {
    public static int isDigitSum(int n, int x) {
        if (n < 0) {
            return -1;
        }
        int temp = 0;
        while (n > 0) {
            temp += n % 10;
            n = n / 10;
        }
        return temp < x ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isDigitSum(32121, 10));
        System.out.println(isDigitSum(32121, 9));
        System.out.println(isDigitSum(13, 6));
        System.out.println(isDigitSum(3, 3));
        System.out.println(isDigitSum(-543, 3));
    }
}
