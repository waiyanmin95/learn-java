package compro.Sample;

public class Q501PerfectNumberHenry {
    public static boolean perfectNumber(int n) {
        int total = 0;
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                total += i;
            }
        }
        return total == n;
    }

    public static int perfectResult(int n) {
        int count = 0;
        int result = 0;
        while (count != n) {
            result++;
            if (perfectNumber(result)) {
                count++;
            }
        }
        return result;
    }

    public static int henry(int a, int b) {
        return perfectResult(a) + perfectResult(b);
    }

    public static void main(String[] args) {
        System.out.println(perfectNumber(6));
        System.out.println(perfectResult(1));
        System.out.println(henry(0, 2));
    }
}
