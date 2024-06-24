package compro.Sample.Set2;

public class Q1903isBean {
    public static int isBean(int[] a) {

        for (int i : a) {
            boolean flag = false;
            for (int j : a) {
                if (i == j - 1 || i == j + 1) {
                    flag = true;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[]{2, 10, 9, 3}));
        System.out.println(isBean(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isBean(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isBean(new int[]{0, -1, 1}));
        System.out.println(isBean(new int[]{3, 4, 5, 7}));
    }
}
