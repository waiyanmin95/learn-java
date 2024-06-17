package compro.Sample.Set2;

public class Q1802isMeera {
    public static int isMeera(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= i) {
                return 0;
            }
            sum += a[i];
        }
        if (sum != 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{-4, 0, 1, 0, 2, 1}));
        System.out.println(isMeera(new int[]{-8, 0, 0, 8, 0}));
    }
}
