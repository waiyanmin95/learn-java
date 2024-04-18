package compro.Sample;

public class Q1101fullnessQuotient {
    public static int fullnessQutient(int n) {
        if (n < 0) {
            return -1;
        }
        int count = 0;
        for (int base = 2; base <= 9; base++) {
            int temp = n;
            int isZero = 0;
            while (temp > 0) {
                if (temp % base == 0) {
                    isZero = 1;
                    break;
                }
                temp /= base;
            }
            if (isZero == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fullnessQutient(94));
        System.out.println(fullnessQutient(1));
        System.out.println(fullnessQutient(9));
        System.out.println(fullnessQutient(360));
        System.out.println(fullnessQutient(-4));
    }
}
