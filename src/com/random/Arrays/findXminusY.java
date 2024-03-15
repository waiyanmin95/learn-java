package random.Arrays;

public class findXminusY {
    public static int xMinusY(int[] a) {
        if ( a.length == 0 ) {
            return 0;
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] % 2 == 0 ) {
                y += a[i];
            } else {
                x += a[i];
            }
        }
        return x - y;
    }

    public static void main(String[] args) {
        System.out.println(xMinusY(new int[]{1}));
        System.out.println(xMinusY(new int[]{1, 2}));
        System.out.println(xMinusY(new int[]{1, 2, 3}));
        System.out.println(xMinusY(new int[]{1, 2, 3, 4}));
        System.out.println(xMinusY(new int[]{3, 3, 4, 4}));
        System.out.println(xMinusY(new int[]{3, 2, 3, 4}));
        System.out.println(xMinusY(new int[]{4, 1, 2, 3}));
        System.out.println(xMinusY(new int[]{1, 1}));
        System.out.println(xMinusY(new int[]{}));
    }
}
