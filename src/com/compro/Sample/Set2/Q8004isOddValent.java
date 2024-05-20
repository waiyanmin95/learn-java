package compro.Sample.Set2;

public class Q8004isOddValent {
    public static int isOddValent(int[] a) {
        boolean hasSameValue = false;
        boolean isOdd = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (a[i] == a[j]) {
                        hasSameValue = true;
                    }
                }
            }
            if (!isOdd && a[i] % 2 != 0) {
                isOdd = true;
            }
        }
        return hasSameValue && isOdd ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isOddValent(new int[]{9, 3, 4, 9, 1}));
        System.out.println(isOddValent(new int[]{3, 3, 3, 3, 3}));
        System.out.println(isOddValent(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isOddValent(new int[]{2, 2, 2, 4, 4}));
    }
}
