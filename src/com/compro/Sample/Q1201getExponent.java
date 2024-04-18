package compro.Sample;

public class Q1201getExponent {
    public static int getExponent(int n, int p) {
        if (p <= 1) {
            return -1;
        }

        n = n < 0 ? -n : n;
        int count = 0;
        for (int i = n; i > 0; i /= p) {
            if (i % p == 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(280, 7));
        System.out.println(getExponent(-250, 5));
        System.out.println(getExponent(18, 1));
        System.out.println(getExponent(128, 4));
    }
}
