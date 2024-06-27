package compro.Sample.Set2;

public class Q2401isAllPossibilities {
    public static int isAllPossibilities(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        for (int i : a) {
            if (i < 0 || i > a.length - 1) {
                return 0;
            }
        }

        int i = 0;
        while (i < a.length) {
            boolean flag = false;
            for (int j : a) {
                if (j == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }
            i++;
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
