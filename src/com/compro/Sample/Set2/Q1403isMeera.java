package compro.Sample.Set2;

public class Q1403isMeera {
    public static int isMeera(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                System.out.println("I: " + i + " J: " + j);
                System.out.println(a[j] * 2 + " " + a[i]);
                if (i != j && a[j] * 2 == a[i]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{3, 5, -2}));
//        System.out.println(isMeera(new int[]{8, 3, 4}));
    }
}
