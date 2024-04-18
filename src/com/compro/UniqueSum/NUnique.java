package compro.UniqueSum;

public class NUnique {
    public static int isNUnique(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (n == a[i] + a[j]) {
                    count++;
                }
            }
        }
        return count == 1 ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 4, 3, 5};
        int[] test2 = {22, 44, 66, 88, 100};
        System.out.println(isNUnique(test1, 5));
        System.out.println(isNUnique(test2, 66));
    }
}
