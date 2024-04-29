package compro.Sample;

public class Q102MadhavArray { //todo
    public static int isMadhavArray(int[] a) {
        int n = 2;
        boolean isCorrectLength = false;
        while (n * (n + 1) <= 2 * a.length) {
            if (n * (n + 1) == 2 * a.length) {
                isCorrectLength = true;
                break;
            } else {
                n++;
            }
        }
        
        if (!isCorrectLength) {
            return 0;
        }

        int num = 2;
        for (int i = 1; i < a.length; ) {
            int sum = 0;
            for (int j = i; j < i + num; j++) {
                sum += a[j];
            }
            if (sum != a[0]) {
                return 0;
            }
            i += num++;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int[] test2 = new int[]{2, 1, 1};
        int[] test3 = new int[]{2, 1, 1, 4, -1, -1};
        int[] test4 = new int[]{18, 9, 10, 6, 6, 6};
        int[] test5 = new int[]{-6, -3, -3, 8, -5, -4};
        System.out.println(isMadhavArray(test1));
        System.out.println(isMadhavArray(test2));
        System.out.println(isMadhavArray(test3));
        System.out.println(isMadhavArray(test4));
        System.out.println(isMadhavArray(test5));
    }
}
