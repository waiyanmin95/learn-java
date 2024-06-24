package compro.Sample.Set2;

public class Q2102isBean {
    public static int isBean(int[] a) {
        if (a.length == 1) {
            return 1;
        }
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j && (a[i] == 2 * a[j] || a[i] == a[j] / 2 || a[i] == (2 * a[j]) + 1)) {
//                    System.out.println("I: " + a[i] + " AND " + 2 * a[j] + " " + a[j] / 2 + " " + ((2 * a[j]) + 1));
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
        System.out.println(isBean(new int[]{4, 9, 8}));
        System.out.println(isBean(new int[]{0}));
        System.out.println(isBean(new int[]{2, 2, 5, 11, 23}));
        System.out.println(isBean(new int[]{7, 7, 3, 6}));
        System.out.println(isBean(new int[]{3, 8, 4}));
    }
}
