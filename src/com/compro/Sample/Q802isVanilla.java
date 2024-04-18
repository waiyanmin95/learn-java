package compro.Sample;

public class Q802isVanilla {
    public static int isVanilla(int[] a) {
        if (a.length <= 1) {
            return 1;
        }
        int first = a[0] % 10;
        for (int j : a) {
            int temp = j;
            if (temp < 0) {
                temp = temp * -1;
            }
            while (temp != 0) {
                if (temp % 10 != first) {
                    return 0;
                }
                temp = temp / 10;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1};
        int[] test2 = new int[]{11, 22, 13, 34, 125};
        int[] test3 = new int[]{9, 999, 99999, -9999};
        int[] test4 = new int[]{};
        int[] test5 = new int[]{11, 111, 111, 1111, 1111};
        int[] test6 = new int[]{11, 111, -111, 1111, 1111};
        System.out.println(isVanilla(test1));
        System.out.println(isVanilla(test2));
        System.out.println(isVanilla(test3));
        System.out.println(isVanilla(test4));
        System.out.println(isVanilla(test5));
        System.out.println(isVanilla(test6));
    }
}
