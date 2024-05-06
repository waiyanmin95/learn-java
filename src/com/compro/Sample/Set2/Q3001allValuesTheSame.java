package compro.Sample.Set2;

public class Q3001allValuesTheSame {
    public static int allValuesTheSame(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        if (a.length == 1) {
            return 1;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[0] != a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(allValuesTheSame(new int[]{1, 1, 1, 1}));
        System.out.println(allValuesTheSame(new int[]{83, 83, 83, 83}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(allValuesTheSame(new int[]{1, -2343456, 1, -2343456}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, -1}));
        System.out.println(allValuesTheSame(new int[]{432123456}));
        System.out.println(allValuesTheSame(new int[]{-432123456}));
        System.out.println(allValuesTheSame(new int[]{}));

    }
}
