package compro.Sample.Set2;

public class Q1201hasKSmallFactors {
    public static boolean hasKSmallFactors(int k, int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                int next = n / i;
                if (i < k && next < k) {
                    return true;
                }
            }
        }
//
//        int i = 2;
//        while (i < n) {
//            int j = i;
//            while (j < n) {
//                if (i < k && j < k) {
//                    if (i * j == n) {
//                        return true;
//                    }
//                }
//                j++;
//            }
//            i++;
//        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(7, 30));
        System.out.println(hasKSmallFactors(6, 14));
        System.out.println(hasKSmallFactors(6, 30));
    }
}
