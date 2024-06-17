package compro.Sample.Set2;

public class Q1603isSetEqual {
    public static int isSetEqual(int[] a, int[] b) {
        for (int i : a) {
            boolean isContain = false;
            for (int j : b) {
                if (i == j) {
                    isContain = true;
                    break;
                }
            }
            if (!isContain) {
                return 0;
            }
        }

        for (int i : b) {
            boolean isContain = false;
            for (int j : a) {
                if (i == j) {
                    isContain = true;
                    break;
                }
            }
            if (!isContain) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSetEqual(new int[]{1, 9, 12}, new int[]{12, 1, 9}));
        System.out.println(isSetEqual(new int[]{9, 1, 12, 1}, new int[]{1, 9, 12, 9, 12, 8, 9}));
        System.out.println(isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 2, 8}));
        System.out.println(isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 6}));
    }
}
