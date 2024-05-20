package compro.Sample.Set2;

public class Q9001isNormal {
    public static int isNormal(int n) {
        int i = 3;
        while (i < n) {
            if (i % 2 == 1) {
                if (n % i == 0) {
                    return 0;
                }
            }
            i += 2;
        }
        return 1;
    }

//    public static int isNormal(int n) {
//        for (int i = 2; i < n; i++) {
//            int factor = 0;
//            if (n % i == 0)
//                factor = i;
//
//            if (factor % 2 != 0)
//                return 0;
//        }
//        return 1;
//    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I is: " + i + " and " + isNormal(i));
        }
    }
}
