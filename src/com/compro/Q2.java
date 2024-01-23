package compro;

public class Q2 {
    public  static int maxDistance(int num) {
        if (num <= 1) {
            return -1;
        }

        int maxFactor = -1;
        int minFactor = Integer.MAX_VALUE;

        for (int i = 2; i <= num / 2; i++) { // find non-trivial factor (neither 1 nor number itself) // { 1, 2, 4, 8 }
            if (num % i == 0) {
                if (i > maxFactor) {
                    maxFactor = i;
                }
                if (i < minFactor) {
                    minFactor = i;
                }
            }
        }

        if (maxFactor == -1 || minFactor == Integer.MAX_VALUE) {
            return -1;
        }
        return maxFactor - minFactor;
    }
    public static void main(String[] args) {
        System.out.println(maxDistance(49));
        System.out.println(maxDistance(119));
        System.out.println(maxDistance(81));
    }
}
