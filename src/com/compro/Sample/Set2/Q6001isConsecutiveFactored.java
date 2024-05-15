package compro.Sample.Set2;

public class Q6001isConsecutiveFactored {
//    public static int isConsectiveFactored(int n) {
//        if (n < 2) {
//            return 0;
//        }
//
//        List<Integer> factor = new ArrayList<>();
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
////                System.out.println(i);
//                factor.add(i);
//            }
//        }
//
//        for (int i = 0, j = 1; i < factor.size(); i++) {
//            if (factor.get(i) > 1 && factor.get(j) == factor.get(i) + 1) {
//                return 1;
//            }
//        }
//        return 0;
//    }

    public static int isConsectiveFactored(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && n % (i + 1) == 0) {
//                System.out.println((i) + " " + (i + 1));
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
//        System.out.println(isConsectiveFactored(24));
//        System.out.println(isConsectiveFactored(105));
//        System.out.println(isConsectiveFactored(90));
//        System.out.println(isConsectiveFactored(23));
//        System.out.println(isConsectiveFactored(15));
//        System.out.println(isConsectiveFactored(2));
//        System.out.println(isConsectiveFactored(0));
//        System.out.println(isConsectiveFactored(-12));
        System.out.println(isConsectiveFactored(100000));

    }
}
