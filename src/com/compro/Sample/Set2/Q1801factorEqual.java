package compro.Sample.Set2;

public class Q1801factorEqual {
    public static int factorCount(int n) {
        if (n <= 0) {
            return 0;
        }

        int i = 1;
        int count = 0;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static int factorEqual(int n, int m) {
        return factorCount(n) == factorCount(m) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(factorEqual(10, 33));
        System.out.println(factorEqual(10, 9));
    }
}
