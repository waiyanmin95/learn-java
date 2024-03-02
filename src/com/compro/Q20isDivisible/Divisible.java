package compro.Q20isDivisible;

public class Divisible {
    public static int isDivisible(int[] arr, int d) {
        for (int j : arr) {
            if (j % d != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = { 22, 44 , 66, 88, 100};
        int[] test2 = { 23, 43 , 63, 83, 103};
        System.out.println(isDivisible(test1, 2));
        System.out.println(isDivisible(test1, 3));
        System.out.println(isDivisible(test2, 4));
        System.out.println(isDivisible(test2, 5));
    }
}
