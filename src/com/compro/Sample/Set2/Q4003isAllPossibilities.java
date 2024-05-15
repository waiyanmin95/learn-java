package compro.Sample.Set2;

public class Q4003isAllPossibilities {
    public static int isAllPossibilities(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        for (int j : a) {
            if (j < 0 || j > a.length - 1) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3}));
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0}));
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3}));
        System.out.println(isAllPossibilities(new int[]{0, 2, 3}));
        System.out.println(isAllPossibilities(new int[]{0}));
        System.out.println(isAllPossibilities(new int[]{}));
    }
}
