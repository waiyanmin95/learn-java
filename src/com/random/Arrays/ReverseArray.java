package random.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] a) {
        if ( a.length == 0 ) {
            return new int[]{};
        }

        int[] newArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[a.length - i - 1];
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse(new int[]{})));
    }
}
