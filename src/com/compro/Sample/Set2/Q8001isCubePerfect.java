package compro.Sample.Set2;

public class Q8001isCubePerfect {
    public static boolean isCube(int n) {
        int i = 0;
        while (i <= n) {
            if (n == i * i * i) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static int isCubePerfect(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = -a[i];
            }
            if (!isCube(a[i])) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        System.out.println(isCube(64));
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }
}
