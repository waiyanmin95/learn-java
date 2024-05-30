package compro.Sample.Set2;

public class Q1302isWave {
    public static int isWave(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(i);
            if (a[i] % 2 == a[i + 1] % 2) { // akwat
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isWave(new int[]{7, 2, 9, 10, 5}));
//        System.out.println(isWave(new int[]{4, 11, 12, 1, 6}));
    }
}
