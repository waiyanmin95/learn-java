package compro.Sample.Set2;

public class Q8003isDaphne {
    public static int isDaphne(int[] a) {
        boolean isOdd = false;
        boolean isEven = false;
        if (a[0] % 2 == 0) {
            isEven = true;
        } else {
            isOdd = true;
        }

        for (int i = 1; i < a.length; i++) {
            if ((isEven && a[i] % 2 != 0) || (isOdd && a[i] % 2 == 0)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{2, 4, 2}));
        System.out.println(isDaphne(new int[]{1, 3, 17, -5}));
        System.out.println(isDaphne(new int[]{2, 3, 5}));
    }
}
