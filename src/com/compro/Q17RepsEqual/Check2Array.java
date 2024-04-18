package compro.Q17RepsEqual;

import java.util.Arrays;

public class Check2Array {
    public static int repsEqual(int[] a, int n) {
        if (a.length == 0) {
            return 0;
        }
        String str = Arrays.toString(a).replaceAll(", |\\[|\\]", "");
        System.out.println(str);
        if (n == Integer.parseInt(str)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] xi = {5, 3, 2, 0, 3};
        int[] test1 = {0, 0, 0, 0, 0};
        System.out.println(repsEqual(xi, 53203));
        System.out.println(repsEqual(test1, 00000));
    }
}
