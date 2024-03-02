package compro.Q2324LegalNumber;

public class LegalNumber {
    public static boolean isLegalNumber(int[] a, int base) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= base ) {
                return false;
            }
        }
        return true;
    }

    public static int convertToBase10(int[] a, int base) {
        int sum = 0;
        int pow = 0;
        for (int i = a.length-1; i >= 0; i--) {
            if ( a[i] >= base ) {
                return -1;
            }
            sum += (int)(a[i] * Math.pow(base, pow));
            pow++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[] {1, 0, 1, 1},  2));
        System.out.println(convertToBase10(new int[] {1, 1, 2},  3));
        System.out.println(convertToBase10(new int[] {3, 2, 5},  8));
        System.out.println(convertToBase10(new int[] {3, 7, 1},  6));
    }
}
