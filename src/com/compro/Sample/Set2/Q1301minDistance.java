package compro.Sample.Set2;

public class Q1301minDistance {
//    public static int minDistance(int n) {
//        int count = 0;
//        int[] factors = new int[4];
//        int i = 1;
//        while (i <= n) {
//            if (n % i == 0) {
//                factors[count] = i;
//                count++;
//            }
//            if (count == 4) {
//                break;
//            }
//            i++;
//        }
//
//        int minDistance = Integer.MAX_VALUE;
//        for (int j = 0; j < factors.length; j++) {
//            for (int k = 0; k < factors.length; k++) {
//                if (j != k && factors[k] > factors[j]) {
//                    if (minDistance > factors[k] - factors[j]) {
//                        minDistance = factors[k] - factors[j];
//                    }
//                }
//            }
//        }
//        return minDistance;
//    }

    public static int minDistance(int n) {
        int previousFactor = 1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i - previousFactor < minDistance) {
                    minDistance = i - previousFactor;
                }
                previousFactor = i;
            }
        }
        return minDistance;
    }


    public static void main(String[] args) {
        System.out.println(minDistance(8));
    }
}
