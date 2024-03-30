package compro.Sample;

import static compro.Sample.Q602isLegalNumber.isLegalNumber;

public class Q603convertToBase10 {
    public static int convertToBase10(int[] a, int base) {
        int result = 0;
        int j = 0;
        if ( 1 == isLegalNumber(a , base)) {
            for (int i = a.length-1; i >= 0; i--) {
                result += (int) (a[i] * Math.pow(base, j));
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[ ] {1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[ ] {1, 1, 2}, 3));
        System.out.println(convertToBase10(new int[ ] {3, 2, 5}, 8));
        System.out.println(convertToBase10 (new int[ ] {3, 7, 1}, 6));
    }
}
