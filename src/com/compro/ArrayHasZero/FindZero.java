package compro.ArrayHasZero;

public class FindZero {
    public static int arrayHasZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5}; // false
        int[] test2 = {1, 2, 0, 4, 5}; // true
        System.out.println(arrayHasZero(test1));
        System.out.println(arrayHasZero(test2));
    }
}
