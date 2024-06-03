package compro.Sample.Set2;

public class Q1503isNice {
    public static int isNice(int[] a) {
        int sameCount = 0;
        for (int i = 0; i < a.length; i++) {
            boolean sameFlag = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (a[j] - 1 == a[i] || a[j] + 1 == a[i]) {
                        sameFlag = true;
                        break;
                    }
                }
            }
            if (!sameFlag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isNice(new int[]{2, 10, 9, 3}));
        System.out.println(isNice(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isNice(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isNice(new int[]{0, -1, 1}));
        System.out.println(isNice(new int[]{3, 4, 5, 7}));
    }
}
