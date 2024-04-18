package compro.Sample;

public class Q402repsEqual {
    public static int repsEqual(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (int) (a[i] * Math.pow(10, a.length - i - 1));
        }
        return sum == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }
}
