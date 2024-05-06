package compro.Sample.Set2;

public class Q4001sameNumberOfFactors {
    public static int sameNumberOfFactors(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (a == b) {
            return 1;
        }

        if (factorCount(a) != factorCount(b)) {
            return 0;
        }

        return 1;
    }

    private static int factorCount(int a) {
        int count = 0;
        int i = 1;
        while (i <= a) {
            if (a % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(factorCount(21));
        System.out.println(sameNumberOfFactors(-6, 21));
        System.out.println(sameNumberOfFactors(6, 21));
        System.out.println(sameNumberOfFactors(8, 12));
        System.out.println(sameNumberOfFactors(23, 97));
        System.out.println(sameNumberOfFactors(0, 1));
        System.out.println(sameNumberOfFactors(0, 0));


    }
}
