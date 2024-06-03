package compro.Sample.Set2;

public class Q1501isMeera {
    public static int isMeera(int n) {
        int factorCount = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                factorCount++;
            }
        }
        if (n % factorCount == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isMeera(6));
        System.out.println(isMeera(30));
        System.out.println(isMeera(21));
    }
}
