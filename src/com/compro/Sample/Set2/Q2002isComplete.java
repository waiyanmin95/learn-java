package compro.Sample.Set2;

public class Q2002isComplete {
    public static int isComplete(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        boolean isEven = false;
        boolean isSquare = false;
        boolean isSum8 = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                isEven = true;
            }
            if (a[i] != 1 && Q2001isSquare.isSquare(a[i]) == 1) {
                isSquare = true;
            }
            for (int j = i; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    isSum8 = true;
                    break;
                }
            }
            if (isEven && isSquare && isSum8) {
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{36, -28}));
        System.out.println(isComplete(new int[]{36, 28}));
        System.out.println(isComplete(new int[]{4}));
        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));
    }
}
